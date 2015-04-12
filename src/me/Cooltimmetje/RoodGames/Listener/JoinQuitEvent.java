package me.Cooltimmetje.RoodGames.Listener;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.InventoryUtils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * This class has been created on 10-4-2015 at 23:15 by cooltimmetje.
 */
public class JoinQuitEvent implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player p = event.getPlayer();
        if(!p.isOp()) {
            InventoryUtils.setInventory(p);
        } else {
            ChatUtils.msgPlayer("&eSince you are a OP, your inventory was not reset on join. You can do &o/resetinv &eif you wish to reset your inventory!", p);
        }
    }

}
