package com.github.eisblume2000.wearableBanner;

import org.bukkit.plugin.java.JavaPlugin;
import com.github.eisblume2000.wearableBanner.commands.equipbannerCommand;


public final class WearableBanner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("WearableBanner is booting...");
        getCommand("equipbanner").setExecutor(new equipbannerCommand());
        System.out.println("Loaded Command: equipbanner!");
        System.out.println("WearableBanner finished booting!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
