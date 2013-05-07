package nl.webmichiel.decogems.item;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import nl.webmichiel.decogems.lib.Color;
import nl.webmichiel.decogems.lib.TextureHelper;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Decorative-Gems-Mod
 * 
 * @author Msvisser
 * Copyright (c) 2013
 */
public class GemItem extends Item {

    private Icon[] itemIcons = new Icon[16];
    private final static String[] subNames = { "white", "orange", "magenta", "lightBlue", "yellow", "lightGreen", "pink", "darkGrey", "lightGrey", "cyan", "purple", "blue", "brown", "green", "red",
            "black" };

    public GemItem(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setMaxDamage(0);
        this.setUnlocalizedName("gemItem");
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
        for (int i = 0; i < 16; i++) {
            if (i != Color.BLUE) {
                itemIcons[i] = TextureHelper.getIconFromTextureName(par1IconRegister, "Gem_" + Color.getColorFromMetadata(i).replaceAll(" ", ""));
            }
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta) {
        if (meta == Color.BLUE)
            return null;
        return itemIcons[meta];
    }

    @Override
    @SuppressWarnings({ "unchecked", "rawtypes" })
    @SideOnly(Side.CLIENT)
    public void getSubItems(int par1, CreativeTabs tab, List subItems) {
        for (int i = 0; i < 16; i++) {
            if (i != Color.BLUE) {
                subItems.add(new ItemStack(this, 1, i));
            }
        }
    }
}
