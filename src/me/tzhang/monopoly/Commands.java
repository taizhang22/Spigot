
package me.tzhang.monopoly;

import static org.bukkit.Bukkit.getServer;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Commands implements CommandExecutor, Listener {

    public String cmd1 = "roll";

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player){
            if(cmd.getName().equalsIgnoreCase(cmd1)) {
                getServer().broadcastMessage(RollDie.roll());
            }

        } else {
            sender.sendMessage(ChatColor.RED + "Only players can use this command!");
            return true;
        }
        return false;
    }
}

