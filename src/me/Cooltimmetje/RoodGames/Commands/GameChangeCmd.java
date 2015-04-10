package me.Cooltimmetje.RoodGames.Commands;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import me.Cooltimmetje.RoodGames.Utils.MiscUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class has been created on 10-4-2015 at 19:31 by cooltimmetje.
 */
public class GameChangeCmd implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(cmd.getLabel().equalsIgnoreCase("setgame")){
            if(args.length == 1){
                if(MiscUtils.isInt(args[0])){
                    int game = Integer.parseInt(args[0]);
                    LobbyUtils.setGame(game, p);
                    return true;
                } else {
                    ChatUtils.msgPlayer("&cPlease provide a number!", p);
                    return false;
                }
            } else {
                ChatUtils.msgPlayer("&cPlease provide a number!", p);
                return false;
            }
        }
        return true;
    }
}
