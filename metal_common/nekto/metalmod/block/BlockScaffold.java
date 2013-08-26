package nekto.metalmod.block;

import nekto.metalmod.MetalMod;
import nekto.metalmod.ref.GeneralRef;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockScaffold extends Block
{

    public BlockScaffold(int id)
    {
        super(id, Material.rock);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("scaffold");
        setCreativeTab(MetalMod.metalTab);
    }

    private Icon field_94458_cO;
    private Icon field_94459_cN;

    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.field_94458_cO
                : (par1 == 0 ? this.field_94458_cO : this.blockIcon);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean isLadder(World world, int x, int y, int z)
    {
        return true;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(GeneralRef.TEXTURE_PATH
                + "scaffold_side");
        this.field_94458_cO = par1IconRegister
                .registerIcon(GeneralRef.TEXTURE_PATH + "scaffold_top");
    }
}
