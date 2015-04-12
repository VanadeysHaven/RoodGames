package me.Cooltimmetje.RoodGames.Utils;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import me.Cooltimmetje.RoodGames.Main;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import pl.merbio.charsapi.objects.CharsBuilder;
import pl.merbio.charsapi.objects.CharsString;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class has been created on 12-4-2015 at 13:11 by cooltimmetje.
 */
public class LobbyUtils {

    static NPCRegistry registry = CitizensAPI.getNPCRegistry();

    //HashMaps
        //Questmaster HashMaps
        public static HashMap<Integer, Location> qmLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> qmFacings = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> qmHoloLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, NPC> qmNPCs = new HashMap<Integer, NPC>();
        public static HashMap<Integer, Hologram> qmHolos = new HashMap<Integer, Hologram>();
        //MysteryBox HashMaps
        public static HashMap<Integer, Location> miLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> miFacings = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> miHoloLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> mbHoloLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, NPC> miNPCs = new HashMap<Integer, NPC>();
        public static HashMap<Integer, Hologram> miHolos = new HashMap<Integer, Hologram>();
        public static HashMap<Integer, Hologram> mbHolos = new HashMap<Integer, Hologram>();
        //Statue HashMaps
        public static HashMap<Integer, Location> statueLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, Location> statueHoloLocations = new HashMap<Integer, Location>();
        public static HashMap<Integer, String> statueNames = new HashMap<Integer, String>();
        public static HashMap<Integer, String> statueLores = new HashMap<Integer, String>();
        public static HashMap<Integer, NPC> statueNPCs = new HashMap<Integer, NPC>();
        public static HashMap<Integer, Entity> statueAs = new HashMap<Integer, Entity>();
        public static HashMap<Integer, Hologram> statueHolos = new HashMap<Integer, Hologram>();
        public static HashMap<Entity, String> statueRide = new HashMap<Entity, String>();
        public static HashMap<Integer, ItemStack> statueItem = new HashMap<Integer, ItemStack>();



    //ArrayLists
    public static ArrayList<Entity> isMI = new ArrayList<Entity>();
    public static ArrayList<Entity> isQM = new ArrayList<Entity>();
    public static ArrayList<Entity> isStaffNPC = new ArrayList<Entity>();

    static Block centerLobby = Bukkit.getWorld("Minigames").getBlockAt(0, 80, 0);

    //Questmaster Data
        //Questmaster Faceing
        static Location questMasterFace1 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86, -6).getLocation();
        static Location questMasterFace2 = Bukkit.getWorld("Minigames").getBlockAt(6, 86 ,-6).getLocation();
        static Location questMasterFace3 = Bukkit.getWorld("Minigames").getBlockAt(6, 86, 6).getLocation();
        static Location questMasterFace4 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86 , 6).getLocation();
        //Questmaster Locations
        static Location questMasterLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 ,-7).getLocation();
        static Location questMasterLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 85, -7).getLocation();
        static Location questMasterLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 85 , 7).getLocation();
        static Location questMasterLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 , 7).getLocation();
        //Questmaster Holo Locations
        static Location questHoloLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88, -7).getLocation();
        static Location questHoloLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 88, -7).getLocation();
        static Location questHoloLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 88, 7).getLocation();
        static Location questHoloLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88, 7).getLocation();

    //Mystery Box Data
        //ChestHolo Locations
        static Location chest1 = Bukkit.getWorld("Minigames").getBlockAt(13, 85, -13).getLocation();
        static Location chest2 = Bukkit.getWorld("Minigames").getBlockAt(13, 85, 13).getLocation();
        static Location chest3 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85, 13).getLocation();
        static Location chest4 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85, -13).getLocation();
        //Mystery Villager Locations
        static Location mysteryInfoLoc1 = Bukkit.getWorld("Minigames").getBlockAt(15, 82 ,-12).getLocation();
        static Location mysteryInfoLoc2 = Bukkit.getWorld("Minigames").getBlockAt(12, 82, 15).getLocation();
        static Location mysteryInfoLoc3 = Bukkit.getWorld("Minigames").getBlockAt(-15, 82, 12).getLocation();
        static Location mysteryInfoLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-12, 82, -15).getLocation();
        //Mystery Villager Facing
        static Location mysteryInfoFace1 = Bukkit.getWorld("Minigames").getBlockAt(16, 83, -16).getLocation();
        static Location mysteryInfoFace2 = Bukkit.getWorld("Minigames").getBlockAt(16, 83, 16).getLocation();
        static Location mysteryInfoFace3 = Bukkit.getWorld("Minigames").getBlockAt(-16, 83, 16).getLocation();
        static Location mysteryInfoFace4 = Bukkit.getWorld("Minigames").getBlockAt(-16, 83, -16).getLocation();
        //Mystery Villager Holo Locations
        static Location mysteryInfoHolo1 = Bukkit.getWorld("Minigames").getBlockAt(15, 85, -12).getLocation();
        static Location mysteryInfoHolo2 = Bukkit.getWorld("Minigames").getBlockAt(12, 85, 15).getLocation();
        static Location mysteryInfoHolo3 = Bukkit.getWorld("Minigames").getBlockAt(-15, 85, 12).getLocation();
        static Location mysteryInfoHolo4 = Bukkit.getWorld("Minigames").getBlockAt(-12, 85, -15).getLocation();

    //Statue Data
        static Location cooltimmetjeLoc = Bukkit.getWorld("Minigames").getBlockAt(-35, 82 ,0).getLocation();
        static Location cooltimmetjeHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-34, 83, 0).getLocation();
        static String cooltimmetjeName = "Cooltimmetje";
        static String cooltimmetjeLore = "&3Plugin Developer";
        static ItemStack cooltimmetjeItem = new ItemStack(Material.COMMAND);

        static Location thothokillLoc = Bukkit.getWorld("Minigames").getBlockAt(-31, 81, 3).getLocation();
        static Location thothokillHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-30, 82, 3).getLocation();
        static String thothokillName = "ThoThoKill";
        static String thothokillLore = "&cSponsor of R00D";
        static ItemStack thothokillItem = new ItemStack(Material.INK_SACK, 1, (byte) 1);

        static Location swagyoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-31, 81, -3).getLocation();
        static Location swagyoloHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-30, 82, -3).getLocation();
        static String swagyoloName = "SwagYoloFishMC";
        static String swagyoloLore = "&dBRUH";
        static ItemStack swagyoloItem = new ItemStack(Material.IRON_SWORD);

    //Hologram Strings
    static String chestName = "&eMystery Box";
    static String soonTM = "&7Coming SoonTM";
    static String questName = "&eQuest Master";
    static String mysteryInfoName = "&eMystery Box Info";
    static String rightClick = "&3(Right Click)";

    //CharAPI
    static CharsBuilder serverName;
    static CharsString serverNameText;
    static CharsBuilder gameName;
    static CharsString gameNameText;
    static CharsBuilder staffName;
    static CharsString staffNameText;
    static CharsBuilder south;
    static CharsString southText;
    static CharsBuilder east;
    static CharsString eastText;

    public static void setupLobby() { //TODO: Make statement working
        registerQuestMasters();
        for(Integer i : qmLocations.keySet()){
            Location spawn = qmLocations.get(i);
            Location facing = qmFacings.get(i);
            NPC npc = registry.createNPC(EntityType.VILLAGER, "");
            npc.spawn(spawn.add(0.5, 0, 0.5));
            npc.faceLocation(facing.add(0.5, 0, 0.5));
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + npc.getId());
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
            isQM.add(npc.getEntity());
            qmNPCs.put(i, npc);
        }
        for(Integer i : qmHoloLocations.keySet()){
            Location spawn = qmHoloLocations.get(i);
            Hologram hologram = HologramsAPI.createHologram(Main.getPlugin(), spawn.add(0.5, -0.3, 0.5));
            hologram.appendTextLine(MiscUtils.color(questName));
            hologram.appendTextLine(MiscUtils.color(soonTM));
            qmHolos.put(i, hologram);
        }

        registerMysteryBox();
        for(Integer i : miLocations.keySet()){
            Location spawn = miLocations.get(i);
            Location facing = miFacings.get(i);
            NPC npc = registry.createNPC(EntityType.VILLAGER, "");
            npc.spawn(spawn.add(0.5, 0, 0.5));
            npc.faceLocation(facing.add(0.5, 0, 0.5));
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + npc.getId());
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
            isMI.add(npc.getEntity());
            miNPCs.put(i, npc);
        }
        for(Integer i : miHoloLocations.keySet()){
            Location spawn = miHoloLocations.get(i);
            Hologram hologram = HologramsAPI.createHologram(Main.getPlugin(), spawn.add(0.5, -0.3, 0.5));
            hologram.appendTextLine(MiscUtils.color(mysteryInfoName));
            hologram.appendTextLine(MiscUtils.color(rightClick));
            miHolos.put(i, hologram);
        }
        for(Integer i : mbHoloLocations.keySet()){
            Location spawn = mbHoloLocations.get(i);
            Hologram hologram = HologramsAPI.createHologram(Main.getPlugin(), spawn.add(0.5, -0.5, 0.5));
            hologram.appendTextLine(MiscUtils.color(chestName));
            hologram.appendTextLine(MiscUtils.color(soonTM));
            mbHolos.put(i, hologram);
        }

        serverName = new CharsBuilder();
        serverNameText = serverName.replace("$l#c&4R00D$l#c&eGames");
        serverNameText = serverName.build(centerLobby.getLocation().add(0, 16, -51),BlockFace.NORTH , serverNameText);

        gameName = new CharsBuilder();
        gameNameText = gameName.replace("$l#c&7No Game Selected");
        gameNameText = gameName.build(centerLobby.getLocation().add(0, 10, -50), BlockFace.NORTH, gameNameText);

        staffName = new CharsBuilder();
        staffNameText = staffName.replace("$l#c&2Staff and Friends");
        staffNameText = staffName.build(centerLobby.getLocation().add(-50, 10, 0), BlockFace.WEST, staffNameText);

        south = new CharsBuilder();
        southText = south.replace("$l#c&7south");
        southText = south.build(centerLobby.getLocation().add(0, 10, 50), BlockFace.SOUTH, southText);

        east = new CharsBuilder();
        eastText = east.replace("$l#c&7east");
        eastText = east.build(centerLobby.getLocation().add(50, 10, 0), BlockFace.EAST, eastText);

        registerStatues();
        for(Integer i : statueLocations.keySet()){
            Location spawn = statueLocations.get(i);
            final String name = statueNames.get(i);
            ItemStack item = statueItem.get(i);
            final NPC npc = registry.createNPC(EntityType.PLAYER, name);
            npc.spawn(spawn.add(0.5, 0, 0.5));
            npc.getBukkitEntity().getEquipment().setItemInHand(item);
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + npc.getId());
            Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");
            final ArmorStand as = (ArmorStand) Bukkit.getWorld("Minigames").spawnEntity(spawn, EntityType.ARMOR_STAND);
            as.setVisible(false);
            as.setSmall(true);
            statueNPCs.put(i, npc);
            statueAs.put(i, as);

            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
                @Override
                public void run() {
                    npc.getEntity().setPassenger(as);
                    statueRide.put(npc.getEntity(), name);
                    if(name.equals("ThoThoKill")){
                        npc.getBukkitEntity().getEquipment().setHelmet(InventoryUtils.colorArmor(Material.LEATHER_HELMET, 1, 0, null, null, Color.RED));
                        npc.getBukkitEntity().getEquipment().setChestplate(InventoryUtils.colorArmor(Material.LEATHER_CHESTPLATE, 1, 0, null, null, Color.RED));
                        npc.getBukkitEntity().getEquipment().setBoots(InventoryUtils.colorArmor(Material.LEATHER_BOOTS, 1, 0, null, null, Color.RED));
                    }
                }
            },100);
        }

        for(Integer i : statueHoloLocations.keySet()){
            Location spawn = statueHoloLocations.get(i);
            String name = statueNames.get(i);
            String lore = statueLores.get(i);
            Hologram hologram = HologramsAPI.createHologram(Main.getPlugin(), spawn.add(0.5, -0.5, 0.5));
            if(name.equals("ThoThoKill")) {
                hologram.appendTextLine(MiscUtils.color("&4" + name));
            } else {
                hologram.appendTextLine(MiscUtils.color("&9" + name));
            }
            hologram.appendTextLine(MiscUtils.color(lore));
            statueHolos.put(i, hologram);
        }
    }

    public static void setGame(int game, Player p) { //TODO: Make statement working
    }

    public static void reloadStatues() { //TODO: Make statement working
    }

    public static void clearLobby() { //TODO: Make statement working
        for(Integer i : qmNPCs.keySet()){
            NPC npc = qmNPCs.get(i);
            npc.destroy();
        }
        qmNPCs.clear();

        for(Integer i : qmHolos.keySet()){
            Hologram hologram = qmHolos.get(i);
            hologram.delete();
        }
        qmHolos.clear();

        for(Integer i : miNPCs.keySet()){
            NPC npc = miNPCs.get(i);
            npc.destroy();
        }
        miNPCs.clear();

        for(Integer i : miHolos.keySet()){
            Hologram hologram = miHolos.get(i);
            hologram.delete();
        }
        miHolos.clear();

        for(Integer i : mbHolos.keySet()){
            Hologram hologram = mbHolos.get(i);
            hologram.delete();
        }
        mbHolos.clear();

        for(Integer i : statueNPCs.keySet()){
            NPC npc = statueNPCs.get(i);
            npc.destroy();
        }
        statueNPCs.clear();

        for(Integer i : statueAs.keySet()){
            Entity entity = statueAs.get(i);
            entity.remove();
        }
        statueAs.clear();

        for(Integer i : statueHolos.keySet()){
            Hologram hologram = statueHolos.get(i);
            hologram.delete();
        }
        statueHolos.clear();

        serverNameText.clearChars(true);
        gameNameText.clearChars(true);
        staffNameText.clearChars(true);
        southText.clearChars(true);
        eastText.clearChars(true);
    }

    public static void registerMysteryBox() {
        if(miLocations.isEmpty()){
            miLocations.put(1, mysteryInfoLoc1);
            miLocations.put(2, mysteryInfoLoc2);
            miLocations.put(3, mysteryInfoLoc3);
            miLocations.put(4, mysteryInfoLoc4);
        }
        if(miFacings.isEmpty()){
            miFacings.put(1, mysteryInfoFace1);
            miFacings.put(2, mysteryInfoFace2);
            miFacings.put(3, mysteryInfoFace3);
            miFacings.put(4, mysteryInfoFace4);
        }
        if(miHoloLocations.isEmpty()){
            miHoloLocations.put(1, mysteryInfoHolo1);
            miHoloLocations.put(2, mysteryInfoHolo2);
            miHoloLocations.put(3, mysteryInfoHolo3);
            miHoloLocations.put(4, mysteryInfoHolo4);
        }
        if(mbHoloLocations.isEmpty()){
            mbHoloLocations.put(1, chest1);
            mbHoloLocations.put(2, chest2);
            mbHoloLocations.put(3, chest3);
            mbHoloLocations.put(4, chest4);
        }
    }

    public static void registerQuestMasters() {
        //Add locations
        if(qmLocations.isEmpty()) {
            qmLocations.put(1, questMasterLoc1);
            qmLocations.put(2, questMasterLoc2);
            qmLocations.put(3, questMasterLoc3);
            qmLocations.put(4, questMasterLoc4);
        }
        //Add Facings
        if(qmFacings.isEmpty()) {
            qmFacings.put(1, questMasterFace1);
            qmFacings.put(2, questMasterFace2);
            qmFacings.put(3, questMasterFace3);
            qmFacings.put(4, questMasterFace4);
        }
        //Add Holograms
        if(qmHoloLocations.isEmpty()) {
            qmHoloLocations.put(1, questHoloLoc1);
            qmHoloLocations.put(2, questHoloLoc2);
            qmHoloLocations.put(3, questHoloLoc3);
            qmHoloLocations.put(4, questHoloLoc4);
        }
    }

    public static void registerStatues() {
        if (statueLocations.isEmpty()) {
            statueLocations.put(1, cooltimmetjeLoc);
            statueLocations.put(2, thothokillLoc);
            statueLocations.put(3, swagyoloLoc);
        }
        if (statueHoloLocations.isEmpty()) {
            statueHoloLocations.put(1, cooltimmetjeHoloLoc);
            statueHoloLocations.put(2, thothokillHoloLoc);
            statueHoloLocations.put(3, swagyoloHoloLoc);
        }
        if(statueNames.isEmpty()){
            statueNames.put(1, cooltimmetjeName);
            statueNames.put(2, thothokillName);
            statueNames.put(3, swagyoloName);
        }
        if(statueLores.isEmpty()){
            statueLores.put(1, cooltimmetjeLore);
            statueLores.put(2, thothokillLore);
            statueLores.put(3, swagyoloLore);
        }
        if(statueItem.isEmpty()){
            statueItem.put(1, cooltimmetjeItem);
            statueItem.put(2, thothokillItem);
            statueItem.put(3, swagyoloItem);
        }
    }
}
