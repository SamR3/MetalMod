/*
 *  Author: Sam6982
 */
package nekto.metalmod.furnace;

import nekto.metalmod.block.BlockSmeltingFurnace;
import nekto.metalmod.block.gui.GuiHandler;
import nekto.metalmod.tileentity.TileEntitySmeltingFurnace;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/*@Mod(modid="OresPlusCore", name="Ores Plus Mod", version="x.x.x")
 @NetworkMod(clientSideRequired=true, serverSideRequired=false)*/

public class OresPlusCore
{

    /*
     * //Forge instance
     * 
     * @Instance("OresPlusCore") public static OresPlusCore instance;
     * 
     * 
     * //Blocks public static Block smeltingFurnaceIdle = new
     * BlockSmeltingFurnace(500, false).setCreativeTab(CreativeTabs.tabBlock);
     * public static Block smeltingFurnaceLit = new BlockSmeltingFurnace(501,
     * true);
     * 
     * 
     * 
     * @PreInit public void preInit(FMLPreInitializationEvent event) {}
     * 
     * @Init public void load(FMLInitializationEvent event) {
     * 
     * registerBlocks(); registerNames();
     * 
     * //Gui registry NetworkRegistry.instance().registerGuiHandler(this, new
     * GuiHandler());
     * 
     * //Tile Entity Registry
     * GameRegistry.registerTileEntity(TileEntitySmeltingFurnace.class,
     * "containerSmeltingFurnace");
     * 
     * }
     * 
     * @PostInit public void postInit(FMLPostInitializationEvent event) {}
     * 
     * //Separate method for Forge Block registration public void
     * registerBlocks() { GameRegistry.registerBlock(smeltingFurnaceIdle,
     * "smeltingFurnaceIdle"); GameRegistry.registerBlock(smeltingFurnaceLit,
     * "smeltingFurnaceLit"); }
     * 
     * //Method for name registration public void registerNames() {
     * LanguageRegistry.addName(smeltingFurnaceIdle, "Smelting Furnace"); }
     */
}