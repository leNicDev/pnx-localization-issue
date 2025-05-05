package dev.lenic.localization;

import cn.nukkit.item.ItemTool;
import cn.nukkit.item.customitem.CustomItemDefinition;
import cn.nukkit.item.customitem.ItemCustomTool;
import cn.nukkit.item.customitem.data.CreativeCategory;

public class ItemObsidianPickaxe extends ItemCustomTool {
    public static final String ID = "lenicdev:obsidian_pickaxe";
    private static final String TEXTURE_ID = "obsidian_pickaxe";

    public ItemObsidianPickaxe() {
        super(ID);
    }

    @Override
    public CustomItemDefinition getDefinition() {
        return CustomItemDefinition
                .toolBuilder(this)
                .speed(5)
                .creativeCategory(CreativeCategory.EQUIPMENT)
                .texture(TEXTURE_ID)
                .allowOffHand(true)
                .handEquipped(true)
                .foil(false)
                .build();
    }

    @Override
    public int getMaxDurability() {
        return ItemTool.DURABILITY_IRON * 3;
    }

    @Override
    public boolean isPickaxe() {
        return true;
    }

    @Override
    public int getAttackDamage() {
        return 4;
    }

    @Override
    public int getEnchantAbility() {
        return 50;
    }

    @Override
    public int getTier() {
        return ItemCustomTool.TIER_IRON;
    }
}
