package me.Cooltimmetje.RoodGames.Commands;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class has been created on 11-4-2015 at 16:37 by cooltimmetje.
 */
public class ReloadStatuesCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getLabel().equalsIgnoreCase("reloadstatues")) {
            ChatUtils.msgPlayer("&eStatues reloading... Please wait!", p);
            LobbyUtils.reloadStatues();
        }
        return true;
    }



}
