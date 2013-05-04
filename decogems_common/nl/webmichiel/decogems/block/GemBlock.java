package nl.webmichiel.decogems.block;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import nl.webmichiel.decogems.lib.Color;
import nl.webmichiel.decogems.lib.TextureHelper;

public class GemBlock extends Block {

    private Icon[] blockIcons = new Icon[16];
    
    public GemBlock(int blockID) {
        super(blockID, Material.iron);
        this.setHardness(5.0F);
        this.setUnlocalizedName("gemBlock");
        this.setStepSound(soundMetalFootstep);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        for (int i = 0; i < 16; i++) {
            if (i == Color.BLUE)
                blockIcons[i] = null;
            else
                blockIcons[i] = TextureHelper.getIconFromTextureName(iconRegister, "GemBlock_" + Color.getColorFromMetadata(i).replaceAll(" ", ""));
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int meta) {
        return blockIcons[meta];
    }
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
        for (int i = 0; i < 16; i++) {
            if (i != Color.BLUE)
                subItems.add(new ItemStack(this, 1, i));
        }
    }
    
    

}
