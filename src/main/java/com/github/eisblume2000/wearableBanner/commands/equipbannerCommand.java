package com.github.eisblume2000.wearableBanner.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class equipbannerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        // cheks if player is sender
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Only Players can execute this command!");
            return true;
        }

        final Player player = (Player) commandSender;

        Inventory playerinv = player.getInventory();




        return true;
    }
}
