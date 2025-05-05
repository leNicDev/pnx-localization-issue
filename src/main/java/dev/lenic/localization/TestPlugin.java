package dev.lenic.localization;

import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.registry.RegisterException;
import cn.nukkit.registry.Registries;

public class TestPlugin extends PluginBase {

    @Override
    public void onEnable() {
        try {
            Registries.ITEM.registerCustomItem(this, ItemObsidianPickaxe.class);
        } catch (RegisterException e) {
            throw new RuntimeException("Failed to register custom item", e);
        }

        Enchantment.register(new EnchantmentTest());

        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

}
