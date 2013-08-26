package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockDuralumin extends BlockBase
{
    public BlockDuralumin(int id)
    {
        super(id);
        setHardness(2F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("duralumin");
    }
}