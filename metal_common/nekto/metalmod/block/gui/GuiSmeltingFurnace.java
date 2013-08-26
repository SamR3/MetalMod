/*
 *  Author: Sam6982
 */
package nekto.metalmod.block.gui;

import nekto.metalmod.block.container.ContainerSmeltingFurnace;
import nekto.metalmod.tileentity.TileEntitySmeltingFurnace;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.StatCollector;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class GuiSmeltingFurnace extends GuiContainer
{
    private TileEntitySmeltingFurnace smeltingFurnaceInventory;

    public GuiSmeltingFurnace(InventoryPlayer par1InventoryPlayer, TileEntitySmeltingFurnace par2TileEntityFurnace)
    {
        super(new ContainerSmeltingFurnace(par1InventoryPlayer, par2TileEntityFurnace));
        this.smeltingFurnaceInventory = par2TileEntityFurnace;
    }

    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
        String s = "Smelting Furnace";
        this.fontRenderer.drawString(s, this.xSize / 2 - this.fontRenderer.getStringWidth(s) / 2, 6, 4210752);
        this.fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture("/mods/metalmod/textures/gui/furnacegui.png");
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        int i1;

        if (this.smeltingFurnaceInventory.isBurning())
        {
            i1 = this.smeltingFurnaceInventory.getBurnTimeRemainingScaled(12);
            this.drawTexturedModalRect(k + 11, l + 32 - i1, 176, 13 - i1, 14, i1);
        }

        i1 = this.smeltingFurnaceInventory.getCookProgressScaled(49);
        this.drawTexturedModalRect(k + 55, l + 35, 176, 15, i1, 16);
    }
}
