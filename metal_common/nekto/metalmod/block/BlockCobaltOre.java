package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCobaltOre extends BlockBase
{
    public BlockCobaltOre(int id)
    {
        super(id);
        setHardness(2.0F);
        setStepSound(Block.soundSandFootstep);
        setUnlocalizedName("cobaltore");
    }
}