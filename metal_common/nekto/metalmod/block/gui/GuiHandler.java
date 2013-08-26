/*
 *  Author: Sam6982
 */
package nekto.metalmod.block.gui;

import nekto.metalmod.block.container.ContainerSmeltingFurnace;
import nekto.metalmod.tileentity.TileEntitySmeltingFurnace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{

    // returns an instance of the Container
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

        if (tileEntity instanceof TileEntitySmeltingFurnace)
        {
            return new ContainerSmeltingFurnace(player.inventory,
                    (TileEntitySmeltingFurnace) tileEntity);
        }

        return null;
    }

    // returns an instance of the Gui
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world,
            int x, int y, int z)
    {
        TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

        if (tileEntity instanceof TileEntitySmeltingFurnace)
        {
            return new GuiSmeltingFurnace(player.inventory,
                    (TileEntitySmeltingFurnace) tileEntity);
        }

        return null;
    }
}
