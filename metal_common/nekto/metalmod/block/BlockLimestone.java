package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockLimestone extends BlockBase
{
    public BlockLimestone(int id)
    {
        super(id);
        setHardness(2.0F);
        setStepSound(Block.soundSandFootstep);
        setUnlocalizedName("limestone");
    }
}