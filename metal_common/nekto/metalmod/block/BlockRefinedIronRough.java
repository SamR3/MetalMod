package nekto.metalmod.block;

import net.minecraft.block.Block;

public class BlockRefinedIronRough extends BlockBase
{
    public BlockRefinedIronRough(int id)
    {
        super(id);
        setHardness(3F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("refinedironrough");
    }
}