package nekto.metalmod.block;

import nekto.metalmod.MetalMod;
import nekto.metalmod.ref.GeneralRef;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockBase extends Block
{

    public BlockBase(int id)
    {
        super(id, Material.rock);
        setCreativeTab(MetalMod.metalTab);
    }

    public BlockBase(int id, Material material)
    {
        super(id, material);
        setCreativeTab(MetalMod.metalTab);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(GeneralRef.TEXTURE_PATH + this.getUnlocalizedName().substring(5));
    }

}
