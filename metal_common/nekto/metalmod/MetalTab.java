package nekto.metalmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MetalTab extends CreativeTabs
{
    public MetalTab(String label)
    {
        super(label);
    }

    @Override
    public ItemStack getIconItemStack()
    {
        return new ItemStack(MetalMod.refinedIron);
    }
}
