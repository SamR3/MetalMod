package nekto.metalmod;

import nekto.metalmod.block.BlockAluminum;
import nekto.metalmod.block.BlockAluminumOre;
import nekto.metalmod.block.BlockCobalt;
import nekto.metalmod.block.BlockCobaltOre;
import nekto.metalmod.block.BlockCopper;
import nekto.metalmod.block.BlockCopperOre;
import nekto.metalmod.block.BlockDuralumin;
import nekto.metalmod.block.BlockLimestone;
import nekto.metalmod.block.BlockRefinedIron;
import nekto.metalmod.block.BlockRefinedIronRough;
import nekto.metalmod.block.BlockScaffold;
import nekto.metalmod.block.BlockSmeltingFurnace;
import nekto.metalmod.block.BlockStrongGlass;
import nekto.metalmod.block.BlockTitanium;
import nekto.metalmod.block.BlockTitaniumOre;
import nekto.metalmod.block.gui.GuiHandler;
import nekto.metalmod.item.ItemAluminumIngot;
import nekto.metalmod.item.ItemAluminumPowder;
import nekto.metalmod.item.ItemCopperIngot;
import nekto.metalmod.item.ItemDuraluminIngot;
import nekto.metalmod.item.ItemQuicklime;
import nekto.metalmod.item.ItemSlag;
import nekto.metalmod.item.ItemSodaAsh;
import nekto.metalmod.ref.GeneralRef;
import nekto.metalmod.tileentity.TileEntitySmeltingFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = GeneralRef.MOD_ID, name = GeneralRef.MOD_NAME, version = GeneralRef.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class MetalMod
{

    public static int startingIDIndex = 500;
    public static int startingItemIDIndex = 2000;

    // Tabs
    public static CreativeTabs metalTab = new MetalTab("metalTab");

    // Blocks/Items

    @Instance(GeneralRef.MOD_ID)
    public static MetalMod instance;

    @SidedProxy(clientSide = GeneralRef.CLIENT_PROXY, serverSide = GeneralRef.SERVER_PROXY)
    public static CommonProxy proxy;

    @PreInit
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
    }

    @Init
    public void load(FMLInitializationEvent event)
    {
        setHarvestLevels();
        makeSmeltsAndRecipes();
        registerMisc();

        proxy.registerRenderers();
    }

    private void setHarvestLevels()
    {
    }

    private void makeSmeltsAndRecipes()
    {
    }

    private void registerMisc()
    {
        NetworkRegistry.instance().registerGuiHandler(this, new GuiHandler());
        GameRegistry.registerTileEntity(TileEntitySmeltingFurnace.class, "containerSmeltingFurnace");
    }
}
