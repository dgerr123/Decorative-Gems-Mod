package nl.webmichiel.decogems.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import nl.webmichiel.decogems.lib.Color;

public class GemBlockItem extends ItemBlock {

    private final static String[] subNames = { "white", "orange", "magenta", "lightBlue", "yellow", "lightGreen", "pink", "darkGrey", "lightGrey", "cyan", "purple", "blue", "brown", "green", "red",
            "black" };

    public GemBlockItem(int id) {
        super(id);
        this.setHasSubtypes(true);
        this.setUnlocalizedName("gemBlock");
    }

    @Override
    public int getMetadata(int damageValue) {
        if (damageValue == Color.BLUE)
            return -1;
        return damageValue;
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName() + "." + subNames[itemstack.getItemDamage()];
    }

}
