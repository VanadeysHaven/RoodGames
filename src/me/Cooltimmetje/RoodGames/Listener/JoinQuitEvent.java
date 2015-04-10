package me.Cooltimmetje.RoodGames.Listener;

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
        InventoryUtils.setInventory(p);
    }

}
