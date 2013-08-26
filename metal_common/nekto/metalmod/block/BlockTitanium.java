package nekto.metalmod.block;

import net.minecraft.block.Block;

public class BlockTitanium extends BlockBase
{
    public BlockTitanium(int id)
    {
        super(id);
        setHardness(5F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("titanium");
    }
}