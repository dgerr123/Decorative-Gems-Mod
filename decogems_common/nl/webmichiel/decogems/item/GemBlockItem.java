package nl.webmichiel.decogems.item;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import nl.webmichiel.decogems.lib.Color;
import nl.webmichiel.decogems.lib.Reference;

public class GemBlockItem extends ItemBlock {

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
        return getUnlocalizedName() + "." + Reference.UNLOCALIZED_COLORS[itemstack.getItemDamage()];
    }

}
