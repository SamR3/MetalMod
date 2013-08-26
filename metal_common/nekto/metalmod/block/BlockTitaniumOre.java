package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTitaniumOre extends BlockBase
{
    public BlockTitaniumOre(int id)
    {
        super(id);
        setHardness(3F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("titaniumore");
    }
}