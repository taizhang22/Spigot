
package me.tzhang.monopoly;

import net.minecraft.server.v1_14_R1.CommandExecute;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import static org.bukkit.Bukkit.getServer;

public class Commands extends CommandExecute implements Listener, CommandExecutor {

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

