package com.abhiram.minestore.commands;

import com.abhiram.minestore.MineStore;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor {
    private MineStore plugin;

    public ReloadCommand(MineStore plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if(args.length == 0){
            commandSender.sendMessage(ChatColor.YELLOW + "[Minestore] Useage /ms reload");
            return true;
        }
        if(args[0].equalsIgnoreCase("reload")) {
            plugin.config.Reload();
            plugin.buy.Reload();
            plugin.getLogger().warning("Reloaded.");
            commandSender.sendMessage(ChatColor.YELLOW + "[Minestore] Reloaded.");
        }
        return true;
    }
}
