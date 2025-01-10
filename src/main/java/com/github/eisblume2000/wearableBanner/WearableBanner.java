package com.github.eisblume2000.wearableBanner;

import org.bukkit.plugin.java.JavaPlugin;
import com.github.eisblume2000.wearableBanner.commands.equipbannerCommand;


public final class WearableBanner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("equipbanner").setExecutor(new equipbannerCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
