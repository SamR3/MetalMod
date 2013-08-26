package nekto.metalmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockCopper extends BlockBase
{
    public BlockCopper(int id)
    {
        super(id);
        setHardness(1F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("copper");
    }
}