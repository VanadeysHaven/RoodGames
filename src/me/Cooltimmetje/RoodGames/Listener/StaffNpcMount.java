package me.Cooltimmetje.RoodGames.Listener;

import com.avaje.ebeaninternal.server.deploy.BeanDescriptor;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

/**
 * This class has been created on 11-4-2015 at 14:07 by cooltimmetje.
 */
public class StaffNpcMount implements Listener{

    @EventHandler
    public void onStaffNpcInteract(PlayerInteractEntityEvent event) {
        Player p = event.getPlayer();
//        if(LobbyUtils.statueRide.containsKey(event.getRightClicked())) {
//            if (LobbyUtils.statueRide.get(event.getRightClicked()).equals(p.getName())) {
//                event.getRightClicked().getPassenger().setPassenger(p);
//            }
//        }
        if(event.getRightClicked().getType() == EntityType.PLAYER){
            if(event.getRightClicked().getName().equals(p.getName())){
                if(event.getRightClicked().getPassenger() != null){
                    event.getRightClicked().getPassenger().setPassenger(p);
                } else {
                    event.getRightClicked().setPassenger(p);
                }
            }
        }
    }


}
