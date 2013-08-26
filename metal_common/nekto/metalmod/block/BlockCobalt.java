package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCobalt extends BlockBase
{
    public BlockCobalt(int id)
    {
        super(id);
        setHardness(2.0F);
        setStepSound(Block.soundSandFootstep);
        setUnlocalizedName("cobalt");
    }
}