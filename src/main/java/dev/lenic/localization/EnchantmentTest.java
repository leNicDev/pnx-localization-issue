package dev.lenic.localization;

import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.item.enchantment.EnchantmentType;
import cn.nukkit.utils.Identifier;

public class EnchantmentTest extends Enchantment {
    public static final Identifier ID = new Identifier("lenicdev:test");

    protected EnchantmentTest() {
        super(ID, "%lenicdev:test", Rarity.RARE, EnchantmentType.DIGGER);
    }
}
