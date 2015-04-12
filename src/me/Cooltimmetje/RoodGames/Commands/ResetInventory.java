package me.Cooltimmetje.RoodGames.Commands;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.InventoryUtils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * This class has been created on 11-4-2015 at 17:23 by cooltimmetje.
 */
public class ResetInventory implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getLabel().equalsIgnoreCase("resetinv")) {
            if(p.isOp()){
                ChatUtils.msgPlayer("&eYour inventory was reset!", p);
                InventoryUtils.setInventory(p);
            } else {
                ChatUtils.msgPlayer("&cYou can't do this!", p);
            }
        }
        return true;
    }
}
