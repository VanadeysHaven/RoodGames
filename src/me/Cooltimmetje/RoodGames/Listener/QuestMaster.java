package me.Cooltimmetje.RoodGames.Listener;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import me.Cooltimmetje.RoodGames.Utils.MiscUtils;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

/**
 * This class has been created on 11-4-2015 at 11:58 by cooltimmetje.
 */
public class QuestMaster implements Listener {

    @EventHandler
    public void onQuestMasterInteract(PlayerInteractEntityEvent event){
        Player p = event.getPlayer();
        if(event.getRightClicked() instanceof Villager) {
            if (LobbyUtils.isQM.contains(event.getRightClicked())) {
                    ChatUtils.msgPlayer("&8[&eQuest Master&8] &eVillager_" + MiscUtils.randomInt(1, 999999) + " &8» &fHmmm...", p);
            } else {
                return;
            }
        }
    }
}
