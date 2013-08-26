package nekto.metalmod.block;

import nekto.metalmod.MetalMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAluminum extends BlockBase
{

    public BlockAluminum(int id)
    {
        super(id);
        setHardness(2F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("aluminum");
    }
}