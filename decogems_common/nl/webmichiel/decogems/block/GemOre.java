package nl.webmichiel.decogems.block;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import nl.webmichiel.decogems.lib.Color;
import nl.webmichiel.decogems.lib.ItemHelper;
import nl.webmichiel.decogems.lib.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GemOre extends Block {

    private Icon[] blockIcons = new Icon[16];

    public GemOre(int blockID) {
        super(blockID, Material.rock);
        this.setHardness(3.0F);
        this.setUnlocalizedName("gemOre");
        this.setStepSound(soundStoneFootstep);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        for (int i = 0; i < 16; i++) {
            if (i == Color.BLUE) {
                blockIcons[i] = null;
            } else {
                blockIcons[i] = TextureHelper.getIconFromTextureName(iconRegister, "GemOre_" + Color.getColorFromMetadata(i).replaceAll(" ", ""));
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int par1, int meta) {
        return blockIcons[meta];
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs tab, List subItems) {
        for (int i = 0; i < 16; i++) {
            if (i != Color.BLUE) {
                subItems.add(new ItemStack(this, 1, i));
            }
        }
    }

    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return ItemHelper.gemItem.itemID;
    }

    @Override
    public int damageDropped(int meta) {
        return meta;
    }

    @Override
    public int quantityDropped(Random random) {
        return 4 + random.nextInt(3);
    }
    
    @Override
    public int quantityDroppedWithBonus(int fortuneLvl, Random random) {
        if (fortuneLvl > 0 && this.blockID != this.idDropped(0, random, fortuneLvl)) {
            int fortune = random.nextInt(fortuneLvl + 2) - 1;

            if (fortune < 0) {
                fortune = 0;
            }

            return this.quantityDropped(random) * (fortune + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

}
