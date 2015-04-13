package me.Cooltimmetje.RoodGames.Commands;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.GameList;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class has been created on 13-4-2015 at 16:59 by cooltimmetje.
 */
public class GameListCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getLabel().equalsIgnoreCase("gamelist")) {
            ChatUtils.msgPlayer("&eList of games:", p);
            for(Integer i : GameList.idGame.keySet()){
                ChatUtils.msgPlayer("&b" + i + ". &9" + GameList.idGame.get(i), p);
            }
        }
        return true;
    }
}
