package me.Cooltimmetje.RoodGames.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/**
 * This class has been created on 10-4-2015 at 18:40 by cooltimmetje.
 */
public class ChatUtils {

    public static void msgPlayer(String msg, Player p){
        p.sendMessage(msg.replace('&', '§'));
    }

    public static void broadcastMsg(String msg){
        Bukkit.broadcastMessage(msg.replace('&', '§'));
    }

}
