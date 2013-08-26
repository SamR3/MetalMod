package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockRefinedIron extends BlockBase
{
    public BlockRefinedIron(int id)
    {
        super(id);
        setHardness(4F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("refinediron");
    }
}