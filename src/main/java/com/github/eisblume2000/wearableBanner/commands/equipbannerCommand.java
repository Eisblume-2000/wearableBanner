package com.github.eisblume2000.wearableBanner.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.bukkit.inventory.PlayerInventory;

public class equipbannerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        // cheks if player is sender
        if (!(commandSender instanceof Player)) {
            commandSender.sendMessage("Only Players can execute this command!");
            return true;
        }

        final Player player = (Player) commandSender;

        PlayerInventory playerinv = player.getInventory();

        ItemStack offhanditem = playerinv.getItemInOffHand();

        ItemStack helmetitem = playerinv.getHelmet();

        String offhandmaterial = offhanditem.getType().toString();

        if (!(offhandmaterial.endsWith("_BANNER"))) {
            commandSender.sendMessage("There needs to be a banner in your offhand!");
            return true;
        }

        playerinv.setHelmet(offhanditem);
        playerinv.setItemInOffHand(helmetitem);
        commandSender.sendMessage("Successfully equipped your banner!");

        return true;
    }
}
