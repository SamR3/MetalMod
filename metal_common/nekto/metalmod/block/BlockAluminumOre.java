package nekto.metalmod.block;

import nekto.metalmod.MetalMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockAluminumOre extends BlockBase
{
    public BlockAluminumOre(int id)
    {
        super(id);
        setHardness(3.0F);
        setStepSound(Block.soundMetalFootstep);
        setUnlocalizedName("aluminumore");
    }
}
