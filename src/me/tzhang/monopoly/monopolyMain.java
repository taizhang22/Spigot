package me.tzhang.monopoly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class monopolyMain extends JavaPlugin implements Listener {
    private Commands commands = new Commands();

        public void onEnable(){
            getCommand(commands.cmd1).setExecutor(commands);
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n Monopoly plugin has been enabled! \n");
        }


    public void onDisable(){
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n Monopoly plugin has been disabled! \n");
    }

}
