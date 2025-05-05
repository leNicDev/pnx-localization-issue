package dev.lenic.localization;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemID;

public class JoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        var item = Item.get(ItemID.DIAMOND);
        event.getPlayer().getInventory().addItem(item);
    }

}
