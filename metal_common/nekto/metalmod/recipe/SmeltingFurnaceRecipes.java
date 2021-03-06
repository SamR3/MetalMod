package nekto.metalmod.recipe;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import nekto.metalmod.MetalMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SmeltingFurnaceRecipes
{

    private static final SmeltingFurnaceRecipes smeltingBase = new SmeltingFurnaceRecipes();

    private Map alloyList = new HashMap();
    private Map experienceList = new HashMap();

    public static final SmeltingFurnaceRecipes smelting()
    {
        return smeltingBase;
    }

    private SmeltingFurnaceRecipes()
    {
        /*
         * Example:
         * 
         * Params: Int par1: First input ID Int par2: Second input ID ItemStack
         * par3IteemStack: Output Float par4: Experience
         */
        this.addAlloy(MetalMod.copperIngot.itemID, MetalMod.aluminumIngot.itemID, new ItemStack(MetalMod.duraluminIngot), 1F);
    }

    public void addAlloy(int par1, int par2, ItemStack par3ItemStack, float par4)
    {
        this.alloyList.put(Arrays.asList(Integer.valueOf(par1), Integer.valueOf(par2)), par3ItemStack);
        this.experienceList.put(Integer.valueOf(par3ItemStack.itemID), Float.valueOf(par4));
    }

    public Map getAlloyList()
    {
        return this.alloyList;
    }

    public ItemStack getAlloyResult(int par1, int par2)
    {
        if (par1 < 0 || par2 < 0)
        {
            return null;
        }

        ItemStack ret = (ItemStack) alloyList.get(Arrays.asList(Integer.valueOf(par1), Integer.valueOf(par2)));

        if (ret != null)
        {
            return ret;

        } else
        {
            ret = (ItemStack) alloyList.get(Arrays.asList(Integer.valueOf(par2), Integer.valueOf(par1)));

            if (ret != null)
                return ret;

            return null;
        }
    }

    public float getExperience(ItemStack item)
    {
        if (item == null || item.getItem() == null)
        {
            return 0;
        }

        float ret = item.getItem().getSmeltingExperience(item);

        if (ret < 0 && experienceList.containsKey(Arrays.asList(item.itemID, item.getItemDamage())))
        {
            ret = ((Float) experienceList.get(Integer.valueOf(item.itemID)));
        }

        if (ret < 0 && experienceList.containsKey(item.itemID))
        {
            ret = ((Float) experienceList.get(item.itemID)).floatValue();
        }

        return (ret < 0 ? 0 : ret);
    }
}
