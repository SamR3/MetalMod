package nekto.metalmod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class BlockItemRegistry
{
    public static final Block aluminum;
    public static final Block aluminumOre;
    public static final Item aluminumBar;
    public static final Item aluminumDust;

    public static final Block cobalt;
    public static final Block cobaltOre;
    public static final Item cobaltBar;
    public static final Item cobaltDust;

    public static final Block copper;
    public static final Block copperOre;
    public static final Item copperBar;
    public static final Item copperDust;

    public static final Block duralumin;
    public static final Item duraluminBar;
    public static final Item duraluminDust;

    public static final Block limestone;
    public static final Item quicklime;

    public static final Block refinedIron;
    public static final Item refinedIronBar;
    public static final Item refinedIronDust;

    public static final Block scaffold;

    public static final Block furnaceIdle;
    public static final Block furnaceLit;

    public static final Block strongGlass;
    public static final Item sodaAsh;

    public static final Block titanium;
    public static final Block titaniumOre;
    public static final Item titaniumBar;
    public static final Item titaniumDust;

    public static void init()
    {
        

        registerBlocks();
        registerItems();
        registerNames();
    }

    private static void registerBlocks()
    {
        GameRegistry.registerBlock(aluminum, "aluminum");
        GameRegistry.registerBlock(aluminumOre, "aluminumOre");
        GameRegistry.registerBlock(cobalt, "cobalt");
        GameRegistry.registerBlock(cobaltOre, "cobaltOre");
        GameRegistry.registerBlock(copper, "copperOre");
        GameRegistry.registerBlock(copperOre, "copperOre");
        GameRegistry.registerBlock(duralumin, "duralumin");
        GameRegistry.registerBlock(furnaceIdle, "furnaceIdle");
        GameRegistry.registerBlock(furnaceLit, "furnaceLit");
        GameRegistry.registerBlock(limestone, "limestone");
        GameRegistry.registerBlock(refinedIron, "refinedIron");
        GameRegistry.registerBlock(scaffold, "scaffold");
        GameRegistry.registerBlock(strongGlass, "strongGlass");
        GameRegistry.registerBlock(titanium, "titanium");
        GameRegistry.registerBlock(titaniumOre, "titaniumOre");
    }

    private static void registerItems()
    {
        GameRegistry.registerItem(aluminumBar, "aluminumBar");
        GameRegistry.registerItem(aluminumDust, "aluminumDust");
        GameRegistry.registerItem(cobaltBar, "cobaltBar");
        GameRegistry.registerItem(cobaltDust, "cobaltDust");
        GameRegistry.registerItem(copperBar, "copperBar");
        GameRegistry.registerItem(copperDust, "copperDust");
        GameRegistry.registerItem(duraluminBar, "duraluminBar");
        GameRegistry.registerItem(duraluminDust, "duraluminDust");
        GameRegistry.registerItem(quicklime, "quicklime");
        GameRegistry.registerItem(refinedIronBar, "refinedIronBar");
        GameRegistry.registerItem(refinedIronDust, "refinedIronDust");
        GameRegistry.registerItem(sodaAsh, "sodaAsh");
        GameRegistry.registerItem(titaniumBar, "titaniumBar");
        GameRegistry.registerItem(titaniumDust, "titaniumDust");
    }

    private static void registerNames()
    {

    }
}
