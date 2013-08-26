package nekto.metalmod.block;

import nekto.metalmod.MetalMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockStrongGlass extends BlockBreakable
{
    public BlockStrongGlass(int id, Material material)
    {
        super(id, "glass", material, false);
        setHardness(0.3F);
        setStepSound(Block.soundMetalFootstep);
        setResistance(1000.0F);
        setCreativeTab(MetalMod.metalTab);
        setUnlocalizedName("strongGlass");
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("metalmod:window");
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
}