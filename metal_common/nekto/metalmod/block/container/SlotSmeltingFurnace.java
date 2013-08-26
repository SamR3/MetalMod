/*
 *  Author: Sam6982
 */
package nekto.metalmod.block.container;

import nekto.metalmod.recipe.SmeltingFurnaceRecipes;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

public class SlotSmeltingFurnace extends Slot
{
    // The player using the GUI that contains this slot
    private EntityPlayer thePlayer;
    private int field_75228_b;

    public SlotSmeltingFurnace(EntityPlayer par1EntityPlayer,
            IInventory par2IInventory, int par3, int par4, int par5)
    {
        super(par2IInventory, par3, par4, par5);
        this.thePlayer = par1EntityPlayer;
    }

    public boolean isItemValid(ItemStack par1ItemStack)
    {
        return false;
    }

    public ItemStack decrStackSize(int par1)
    {
        if (this.getHasStack())
        {
            this.field_75228_b += Math.min(par1, this.getStack().stackSize);
        }

        return super.decrStackSize(par1);
    }

    public void onPickupFromSlot(EntityPlayer par1EntityPlayer,
            ItemStack par2ItemStack)
    {
        this.onCrafting(par2ItemStack);
        super.onPickupFromSlot(par1EntityPlayer, par2ItemStack);
    }

    protected void onCrafting(ItemStack par1ItemStack, int par2)
    {
        this.field_75228_b += par2;
        this.onCrafting(par1ItemStack);
    }

    protected void onCrafting(ItemStack par1ItemStack)
    {
        par1ItemStack.onCrafting(this.thePlayer.worldObj, this.thePlayer,
                this.field_75228_b);

        if (!this.thePlayer.worldObj.isRemote)
        {
            int i = this.field_75228_b;
            float f = SmeltingFurnaceRecipes.smelting().getExperience(
                    par1ItemStack);
            int j;

            if (f == 0.0F)
            {
                i = 0;
            } else if (f < 1.0F)
            {
                j = MathHelper.floor_float((float) i * f);

                if (j < MathHelper.ceiling_float_int((float) i * f)
                        && (float) Math.random() < (float) i * f - (float) j)
                {
                    ++j;
                }

                i = j;
            }

            while (i > 0)
            {
                j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.thePlayer.worldObj.spawnEntityInWorld(new EntityXPOrb(
                        this.thePlayer.worldObj, this.thePlayer.posX,
                        this.thePlayer.posY + 0.5D, this.thePlayer.posZ + 0.5D,
                        j));
            }
        }

        this.field_75228_b = 0;
    }
}