package me.Cooltimmetje.RoodGames.Listener;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

/**
 * This class has been created on 10-4-2015 at 21:05 by cooltimmetje.
 */
public class MysteryBox implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if(event.getClickedBlock().getType().equals(Material.ENDER_CHEST)){
                event.setCancelled(true);
                ChatUtils.msgPlayer("&cThe Mystery Chest is still a mystery! SoonTM", p);
            }
        }
    }

}
