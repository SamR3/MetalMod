package nekto.metalmod.item;

import nekto.metalmod.MetalMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemBase extends Item
{

    public ItemBase(int par1)
    {
        super(par1);
        setCreativeTab(MetalMod.metalTab);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon("metalmod:"
                + this.getUnlocalizedName().substring(5));
    }
}
