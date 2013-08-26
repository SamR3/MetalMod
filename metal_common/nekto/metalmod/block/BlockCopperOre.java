package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCopperOre extends BlockBase
{
    public BlockCopperOre(int id)
    {
        super(id);
        setHardness(3.0F);
        setStepSound(Block.soundStoneFootstep);
        setUnlocalizedName("copperore");
    }
}