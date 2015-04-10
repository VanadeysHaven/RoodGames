package me.Cooltimmetje.RoodGames.Utils;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import me.Cooltimmetje.RoodGames.Main;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import pl.merbio.charsapi.objects.CharsBuilder;
import pl.merbio.charsapi.objects.CharsString;

/**
 * This class has been created on 10-4-2015 at 18:41 by cooltimmetje.
 */
public class LobbyUtils {

    static Block centerLobby = Bukkit.getWorld("Minigames").getBlockAt(0, 80 ,0);
    static Block chest1 = Bukkit.getWorld("Minigames").getBlockAt(13, 85 ,-13);
    static Block chest2 = Bukkit.getWorld("Minigames").getBlockAt(13, 85 ,13);
    static Block chest3 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85 ,13);
    static Block chest4 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85 ,-13);
    static Block questMasterLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 ,-7);
    static Block questMasterLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 85 ,-7);
    static Block questMasterLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 85 ,7);
    static Block questMasterLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 ,7);
    static Block questMasterFace1 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86, -6);
    static Block questMasterFace2 = Bukkit.getWorld("Minigames").getBlockAt(6, 86 ,-6);
    static Block questMasterFace3 = Bukkit.getWorld("Minigames").getBlockAt(6, 86 ,6);
    static Block questMasterFace4 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86 ,6);
    static Block questHoloLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88 ,-7);
    static Block questHoloLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 88 ,-7);
    static Block questHoloLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 88 ,7);
    static Block questHoloLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88 ,7);


    static NPCRegistry registry = CitizensAPI.getNPCRegistry();
    static NPC questMaster1;
    static NPC questMaster2;
    static NPC questMaster3;
    static NPC questMaster4;

    static String chestName = "&eMystery Chest";
    static String soonTM = "&7Coming SoonTM";
    static String questName = "&eQuest Master";

    static CharsBuilder serverName;
    static CharsString serverNameText;

    static CharsBuilder gameName;
    static CharsString gameNameText;

    static Hologram chestHolo1;
    static Hologram chestHolo2;
    static Hologram chestHolo3;
    static Hologram chestHolo4;

    static Hologram questHolo1;
    static Hologram questHolo2;
    static Hologram questHolo3;
    static Hologram questHolo4;



    public static void setupLobby(){
        serverName = new CharsBuilder();
        serverNameText = serverName.replace("$l#c&4R00D$l#c&eGames");
        serverNameText = serverName.build(centerLobby.getLocation().add(0, 16 , -51), serverNameText);

        gameName = new CharsBuilder();
        gameNameText = gameName.replace("$l#c&7No Game Selected");
        gameNameText = gameName.build(centerLobby.getLocation().add(0, 10 , -50), gameNameText);

        chestHolo1 = HologramsAPI.createHologram(Main.getPlugin(), chest1.getLocation().add(0.5, -0.5, 0.5));
        chestHolo1.appendTextLine(MiscUtils.color(chestName));
        chestHolo1.appendTextLine(MiscUtils.color(soonTM));

        chestHolo2 = HologramsAPI.createHologram(Main.getPlugin(), chest2.getLocation().add(0.5, -0.5, 0.5));
        chestHolo2.appendTextLine(MiscUtils.color(chestName));
        chestHolo2.appendTextLine(MiscUtils.color(soonTM));

        chestHolo3 = HologramsAPI.createHologram(Main.getPlugin(), chest3.getLocation().add(0.5, -0.5, 0.5));
        chestHolo3.appendTextLine(MiscUtils.color(chestName));
        chestHolo3.appendTextLine(MiscUtils.color(soonTM));

        chestHolo4 = HologramsAPI.createHologram(Main.getPlugin(), chest4.getLocation().add(0.5, -0.5, 0.5));
        chestHolo4.appendTextLine(MiscUtils.color(chestName));
        chestHolo4.appendTextLine(MiscUtils.color(soonTM));

        questMaster1 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster1.spawn(questMasterLoc1.getLocation().add(0.5,0,0.5));
        questMaster1.faceLocation(questMasterFace1.getLocation().add(0.5, 0, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster1.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");

        questMaster2 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster2.spawn(questMasterLoc2.getLocation().add(0.5,0,0.5));
        questMaster2.faceLocation(questMasterFace2.getLocation().add(0.5,0,0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster2.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");

        questMaster3 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster3.spawn(questMasterLoc3.getLocation().add(0.5,0,0.5));
        questMaster3.faceLocation(questMasterFace3.getLocation().add(0.5,0,0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster3.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");

        questMaster4 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster4.spawn(questMasterLoc4.getLocation().add(0.5,0,0.5));
        questMaster4.faceLocation(questMasterFace4.getLocation().add(0.5,0,0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster4.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");

        questHolo1 = HologramsAPI.createHologram(Main.getPlugin(), questHoloLoc1.getLocation().add(0.5, -0.3, 0.5));
        questHolo1.appendTextLine(MiscUtils.color(questName));
        questHolo1.appendTextLine(MiscUtils.color(soonTM));

        questHolo2 = HologramsAPI.createHologram(Main.getPlugin(), questHoloLoc2.getLocation().add(0.5, -0.3, 0.5));
        questHolo2.appendTextLine(MiscUtils.color(questName));
        questHolo2.appendTextLine(MiscUtils.color(soonTM));

        questHolo3 = HologramsAPI.createHologram(Main.getPlugin(), questHoloLoc3.getLocation().add(0.5, -0.3, 0.5));
        questHolo3.appendTextLine(MiscUtils.color(questName));
        questHolo3.appendTextLine(MiscUtils.color(soonTM));

        questHolo4 = HologramsAPI.createHologram(Main.getPlugin(), questHoloLoc4.getLocation().add(0.5, -0.3, 0.5));
        questHolo4.appendTextLine(MiscUtils.color(questName));
        questHolo4.appendTextLine(MiscUtils.color(soonTM));


    }



    public static void setGame(int game, Player p){
        if(game > 0 && game <= GameList.gameAmount){
            gameNameText.clearChars(true);
            gameNameText = gameName.replace("$l#c&d" + GameList.idGame.get(game));
            gameNameText = gameName.build(centerLobby.getLocation().add(0, 10 , -50), gameNameText);
            ChatUtils.broadcastMsg("&6&l" + p.getName() + " &e&lchanged the game to &6&l" + GameList.idGame.get(game));
        } else {
            ChatUtils.msgPlayer("&cThis is not a valid game!", p);
        }

    }

    public static void clearLobby(){
        serverNameText.clearChars(true);
        gameNameText.clearChars(true);

        chestHolo1.delete();
        chestHolo2.delete();
        chestHolo3.delete();
        chestHolo4.delete();

        questHolo1.delete();
        questHolo2.delete();
        questHolo3.delete();
        questHolo4.delete();

        questMaster1.destroy();
        questMaster2.destroy();
        questMaster3.destroy();
        questMaster4.destroy();
    }

}
