package org.betamc.colorcodeinfo;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class ColorCodeInfo extends JavaPlugin {
    public void onEnable() {
        getServer().getLogger().info("ColorCodeInfo loaded.");
    }

    public void onDisable() {

    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (
                label.equalsIgnoreCase("colorcodes") ||
                label.equalsIgnoreCase("cc") ||
                label.equalsIgnoreCase("colorcodeinfo") ||
                label.equalsIgnoreCase("colorcode")
        ) {
            sender.sendMessage(ChatColor.GREEN + "List of color codes:\n");
            sender.sendMessage("&" + ChatColor.WHITE + "0 - " + ChatColor.BLACK + "Black");
            sender.sendMessage("&" + ChatColor.WHITE + "1 - " + ChatColor.DARK_BLUE + "Dark Blue");
            sender.sendMessage("&" + ChatColor.WHITE + "2 - " + ChatColor.DARK_GREEN + "Dark Green");
            sender.sendMessage("&" + ChatColor.WHITE + "3 - " + ChatColor.DARK_AQUA + "Dark Aqua");
            sender.sendMessage("&" + ChatColor.WHITE + "4 - " + ChatColor.DARK_RED + "Dark Red");
            sender.sendMessage("&" + ChatColor.WHITE + "5 - " + ChatColor.DARK_PURPLE + "Dark Purple");
            sender.sendMessage("&" + ChatColor.WHITE + "6 - " + ChatColor.GOLD + "Gold");
            sender.sendMessage("&" + ChatColor.WHITE + "7 - " + ChatColor.GRAY + "Gray");
            sender.sendMessage("&" + ChatColor.WHITE + "8 - " + ChatColor.DARK_GRAY + "Dark Gray");
            sender.sendMessage("&" + ChatColor.WHITE + "9 - " + ChatColor.BLUE + "Blue");
            sender.sendMessage("&" + ChatColor.WHITE + "a - " + ChatColor.GREEN + "Green");
            sender.sendMessage("&" + ChatColor.WHITE + "b - " + ChatColor.AQUA + "Aqua");
            sender.sendMessage("&" + ChatColor.WHITE + "c - " + ChatColor.RED + "Red");
            sender.sendMessage("&" + ChatColor.WHITE + "d - " + ChatColor.LIGHT_PURPLE + "Light Purple");
            sender.sendMessage("&" + ChatColor.WHITE + "e - " + ChatColor.YELLOW + "Yellow");
            sender.sendMessage("&" + ChatColor.WHITE + "f - " + ChatColor.WHITE + "White");
        }

        return true;
    }
}
