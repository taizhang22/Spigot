package me.tzhang.monopoly;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class monopolyMain extends JavaPlugin {

        public void onEnable(){
            Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n Monopoly plugin has been enabled! \n");
        }


    public void onDisable(){
        Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n Monopoly plugin has been disabled! \n");
    }


        //Good luck. Don't give up. Try and try again.

    //test




}
