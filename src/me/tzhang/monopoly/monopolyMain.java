package me.tzhang.monopoly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class monopolyMain extends JavaPlugin {
    private Commands commands = new Commands();

    @Override
    public void onEnable(){
        getCommand(commands.cmd1).setExecutor(commands);
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Monopoly plugin has been enabled!");
    }

    @Override
    public void onDisable(){
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Monopoly plugin has been disabled!");
    }

}
