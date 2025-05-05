package dev.lenic.localization;

import cn.nukkit.plugin.PluginBase;

public class TestPlugin extends PluginBase {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
    }

}
