package dev.lenic.localization;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().getInventory().clearAll();
        var pickaxe = Item.get(ItemObsidianPickaxe.ID);
        var enchantment = Enchantment.getEnchantment(EnchantmentTest.ID);
        pickaxe.addEnchantment(enchantment);
        event.getPlayer().getInventory().addItem(pickaxe);
    }

}
