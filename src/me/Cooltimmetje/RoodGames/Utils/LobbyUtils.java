package me.Cooltimmetje.RoodGames.Utils;

import com.gmail.filoghost.holographicdisplays.api.Hologram;
import com.gmail.filoghost.holographicdisplays.api.HologramsAPI;
import me.Cooltimmetje.RoodGames.Main;
import net.citizensnpcs.api.CitizensAPI;
import net.citizensnpcs.api.npc.NPC;
import net.citizensnpcs.api.npc.NPCRegistry;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import pl.merbio.charsapi.objects.CharsBuilder;
import pl.merbio.charsapi.objects.CharsString;

import java.util.HashMap;

/**
 * This class has been created on 10-4-2015 at 18:41 by cooltimmetje.
 */
public class LobbyUtils {

    public static HashMap<Entity, Boolean> isQM = new HashMap<Entity, Boolean>();
    public static HashMap<Entity, Integer> npcID = new HashMap<Entity, Integer>();
    public static HashMap<Entity, String> staffNPC = new HashMap<Entity, String>();
    public static HashMap<Entity, Boolean> isStaffNPC = new HashMap<Entity, Boolean>();
    public static HashMap<Entity, Boolean> isMI = new HashMap<Entity, Boolean>();

    static Block centerLobby = Bukkit.getWorld("Minigames").getBlockAt(0, 80 ,0);

    static Block questMasterLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 ,-7);
    static Block questMasterLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 85 ,-7);
    static Block questMasterLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 85 ,7);
    static Block questMasterLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 85 ,7);
    static Block cooltimmetjeLoc = Bukkit.getWorld("Minigames").getBlockAt(-35, 82 ,0);
    static Block cooltimmetjeHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-34, 83 ,0);
    static Block thothokillLoc = Bukkit.getWorld("Minigames").getBlockAt(-31, 81 ,3);
    static Block thothokillHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-30, 82 ,3);
    static Block swagyoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-31, 81 ,-3);
    static Block swagyoloHoloLoc = Bukkit.getWorld("Minigames").getBlockAt(-30, 82 ,-3);
    static Block questMasterFace1 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86, -6);
    static Block questMasterFace2 = Bukkit.getWorld("Minigames").getBlockAt(6, 86 ,-6);
    static Block questMasterFace3 = Bukkit.getWorld("Minigames").getBlockAt(6, 86 ,6);
    static Block questMasterFace4 = Bukkit.getWorld("Minigames").getBlockAt(-6, 86 ,6);
    static Block questHoloLoc1 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88 ,-7);
    static Block questHoloLoc2 = Bukkit.getWorld("Minigames").getBlockAt(7, 88 ,-7);
    static Block questHoloLoc3 = Bukkit.getWorld("Minigames").getBlockAt(7, 88 ,7);
    static Block questHoloLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-7, 88 ,7);

    static Block chest1 = Bukkit.getWorld("Minigames").getBlockAt(13, 85 ,-13);
    static Block chest2 = Bukkit.getWorld("Minigames").getBlockAt(13, 85 ,13);
    static Block chest3 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85 ,13);
    static Block chest4 = Bukkit.getWorld("Minigames").getBlockAt(-13, 85 ,-13);

    static Block mysteryInfoLoc1 = Bukkit.getWorld("Minigames").getBlockAt(15, 82 ,-12);
    static Block mysteryInfoLoc2 = Bukkit.getWorld("Minigames").getBlockAt(12, 82 ,15);
    static Block mysteryInfoLoc3 = Bukkit.getWorld("Minigames").getBlockAt(-15, 82 ,12);
    static Block mysteryInfoLoc4 = Bukkit.getWorld("Minigames").getBlockAt(-12, 82 ,-15);

    static Block mysteryInfoFace1 = Bukkit.getWorld("Minigames").getBlockAt(16, 83 ,-16);
    static Block mysteryInfoFace2 = Bukkit.getWorld("Minigames").getBlockAt(16, 83 ,16);
    static Block mysteryInfoFace3 = Bukkit.getWorld("Minigames").getBlockAt(-16, 83 ,16);
    static Block mysteryInfoFace4 = Bukkit.getWorld("Minigames").getBlockAt(-16, 83 ,-16);

    static Block mysteryInfoHolo1 = Bukkit.getWorld("Minigames").getBlockAt(15, 85 ,-12);
    static Block mysteryInfoHolo2 = Bukkit.getWorld("Minigames").getBlockAt(12, 85 ,15);
    static Block mysteryInfoHolo3 = Bukkit.getWorld("Minigames").getBlockAt(-15, 85 ,12);
    static Block mysteryInfoHolo4 = Bukkit.getWorld("Minigames").getBlockAt(-12, 85 ,-15);


    static NPCRegistry registry = CitizensAPI.getNPCRegistry();
    static NPC questMaster1;
    static NPC questMaster2;
    static NPC questMaster3;
    static NPC questMaster4;
    static NPC mysteryInfo1;
    static NPC mysteryInfo2;
    static NPC mysteryInfo3;
    static NPC mysteryInfo4;
    public static NPC cooltimmetje;
    public static NPC cooltimmetjeBat;
    public static NPC thothokill;
    public static NPC thothokillBat;
    public static NPC swagyolo;
    public static NPC swagyoloBat;


    static String chestName = "&eMystery Box";
    static String soonTM = "&7Coming SoonTM";
    static String questName = "&eQuest Master";
    static String mysteryInfoName = "&eMystery Box Info";
    static String rightClick = "&3(Right Click)";

    static CharsBuilder serverName;
    static CharsString serverNameText;
    static CharsBuilder gameName;
    static CharsString gameNameText;
    static CharsBuilder staffName;
    static CharsString staffNameText;
    static CharsBuilder lel;
    static CharsString lelText;


    static Hologram chestHolo1;
    static Hologram chestHolo2;
    static Hologram chestHolo3;
    static Hologram chestHolo4;
    static Hologram questHolo1;
    static Hologram questHolo2;
    static Hologram questHolo3;
    static Hologram questHolo4;
    static Hologram cooltimmetjeHolo;
    static Hologram thothokillHolo;
    static Hologram swagyoloHolo;

    static Hologram mysteryHolo1;
    static Hologram mysteryHolo2;
    static Hologram mysteryHolo3;
    static Hologram mysteryHolo4;



    public static void setupLobby(){
        serverName = new CharsBuilder();
        serverNameText = serverName.replace("$l#c&4R00D$l#c&eGames");
        serverNameText = serverName.build(centerLobby.getLocation().add(0, 16 , -51), serverNameText);

        gameName = new CharsBuilder();
        gameNameText = gameName.replace("$l#c&7No Game Selected");
        gameNameText = gameName.build(centerLobby.getLocation().add(0, 10 , -50), gameNameText);

        staffName = new CharsBuilder();
        staffNameText = staffName.replace("$l#c&2Staff and Friends");
        staffNameText = staffName.build(centerLobby.getLocation().add(-50, 10, 0), BlockFace.WEST, staffNameText);

        lel = new CharsBuilder();
        lelText = lel.replace("???");
        lelText = lel.build(centerLobby.getLocation().add(0, 10, 50), BlockFace.SOUTH, lelText);

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
        isQM.put(questMaster1.getEntity(), true);
        npcID.put(questMaster1.getEntity(), questMaster1.getId());

        questMaster2 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster2.spawn(questMasterLoc2.getLocation().add(0.5,0,0.5));
        questMaster2.faceLocation(questMasterFace2.getLocation().add(0.5,0,0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster2.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isQM.put(questMaster2.getEntity(), true);
        npcID.put(questMaster2.getEntity(), questMaster2.getId());

        questMaster3 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster3.spawn(questMasterLoc3.getLocation().add(0.5,0,0.5));
        questMaster3.faceLocation(questMasterFace3.getLocation().add(0.5, 0, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster3.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isQM.put(questMaster3.getEntity(), true);
        npcID.put(questMaster3.getEntity(), questMaster3.getId());

        questMaster4 = registry.createNPC(EntityType.VILLAGER, "");
        questMaster4.spawn(questMasterLoc4.getLocation().add(0.5, 0, 0.5));
        questMaster4.faceLocation(questMasterFace4.getLocation().add(0.5, 0, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + questMaster4.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isQM.put(questMaster4.getEntity(), true);
        npcID.put(questMaster4.getEntity(), questMaster4.getId());

        cooltimmetje = registry.createNPC(EntityType.PLAYER, "Cooltimmetje");
        cooltimmetje.spawn(cooltimmetjeLoc.getLocation().add(0.5, 0, 0.5));
        cooltimmetje.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.COMMAND));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + cooltimmetje.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        cooltimmetjeBat = registry.createNPC(EntityType.BAT, "");
        cooltimmetjeBat.spawn(cooltimmetjeLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + cooltimmetjeBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        cooltimmetjeBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(cooltimmetje.getEntity(), "Cooltimmetje");
                isStaffNPC.put(cooltimmetje.getEntity(), true);
                cooltimmetje.getEntity().setPassenger(cooltimmetjeBat.getEntity());
            }
        },100);

        thothokill = registry.createNPC(EntityType.PLAYER, "ThoThoKill");
        thothokill.spawn(thothokillLoc.getLocation().add(0.5, 0, 0.5));
        thothokill.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.INK_SACK, 1, (byte) 1));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + thothokill.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        thothokillBat = registry.createNPC(EntityType.BAT, "");
        thothokillBat.spawn(thothokillLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + thothokillBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        thothokillBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(thothokill.getEntity(), "ThoThoKill");
                isStaffNPC.put(thothokill.getEntity(), true);
                thothokill.getBukkitEntity().getEquipment().setHelmet(InventoryUtils.colorArmor(Material.LEATHER_HELMET, 1, 0, null, null, Color.RED));
                thothokill.getBukkitEntity().getEquipment().setChestplate(InventoryUtils.colorArmor(Material.LEATHER_CHESTPLATE, 1, 0, null, null, Color.RED));
                thothokill.getBukkitEntity().getEquipment().setBoots(InventoryUtils.colorArmor(Material.LEATHER_BOOTS, 1, 0, null, null, Color.RED));
                thothokill.getEntity().setPassenger(thothokillBat.getEntity());
            }
        },100);

        swagyolo = registry.createNPC(EntityType.PLAYER, "SwagYoloFishMC");
        swagyolo.spawn(swagyoloLoc.getLocation().add(0.5, 0, 0.5));
        swagyolo.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.IRON_SWORD));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + swagyolo.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        swagyoloBat = registry.createNPC(EntityType.BAT, "");
        swagyoloBat.spawn(swagyoloLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + swagyoloBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        swagyoloBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(swagyolo.getEntity(), "SwagYoloFishMC");
                isStaffNPC.put(swagyolo.getEntity(), true);
                swagyolo.getEntity().setPassenger(swagyoloBat.getEntity());
            }
        },100);

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

        cooltimmetjeHolo = HologramsAPI.createHologram(Main.getPlugin(), cooltimmetjeHoloLoc.getLocation().add(0.5, -0.5, 0.5));
        cooltimmetjeHolo.appendTextLine(MiscUtils.color("&9Cooltimmetje"));
        cooltimmetjeHolo.appendTextLine(MiscUtils.color("&3Plugin Developer"));

        thothokillHolo = HologramsAPI.createHologram(Main.getPlugin(), thothokillHoloLoc.getLocation().add(0.5, -0.5, 0.5));
        thothokillHolo.appendTextLine(MiscUtils.color("&4ThoThoKill"));
        thothokillHolo.appendTextLine(MiscUtils.color("&cSponsor of R00D"));

        swagyoloHolo = HologramsAPI.createHologram(Main.getPlugin(), swagyoloHoloLoc.getLocation().add(0.5, -0.5, 0.5));
        swagyoloHolo.appendTextLine(MiscUtils.color("&9SwagYoloFishMC"));
        swagyoloHolo.appendTextLine(MiscUtils.color("&dBRUH"));

        mysteryInfo1 = registry.createNPC(EntityType.VILLAGER, "");
        mysteryInfo1.spawn(mysteryInfoLoc1.getLocation().add(0.5, 0, 0.5));
        mysteryInfo1.faceLocation(mysteryInfoFace1.getLocation().add(0.5, -0.5, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + mysteryInfo1.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isMI.put(mysteryInfo1.getEntity(), true);

        mysteryInfo2 = registry.createNPC(EntityType.VILLAGER, "");
        mysteryInfo2.spawn(mysteryInfoLoc2.getLocation().add(0.5, 0, 0.5));
        mysteryInfo2.faceLocation(mysteryInfoFace2.getLocation().add(0.5, -0.5, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + mysteryInfo2.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isMI.put(mysteryInfo2.getEntity(), true);

        mysteryInfo3 = registry.createNPC(EntityType.VILLAGER, "");
        mysteryInfo3.spawn(mysteryInfoLoc3.getLocation().add(0.5, 0, 0.5));
        mysteryInfo3.faceLocation(mysteryInfoFace3.getLocation().add(0.5, -0.5, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + mysteryInfo3.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isMI.put(mysteryInfo3.getEntity(), true);

        mysteryInfo4 = registry.createNPC(EntityType.VILLAGER, "");
        mysteryInfo4.spawn(mysteryInfoLoc4.getLocation().add(0.5, 0, 0.5));
        mysteryInfo4.faceLocation(mysteryInfoFace4.getLocation().add(0.5, -0.5, 0.5));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + mysteryInfo4.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        isMI.put(mysteryInfo4.getEntity(), true);


        mysteryHolo1 = HologramsAPI.createHologram(Main.getPlugin(), mysteryInfoHolo1.getLocation().add(0.5, -0.3, 0.5));
        mysteryHolo1.appendTextLine(MiscUtils.color(mysteryInfoName));
        mysteryHolo1.appendTextLine(MiscUtils.color(rightClick));

        mysteryHolo2 = HologramsAPI.createHologram(Main.getPlugin(), mysteryInfoHolo2.getLocation().add(0.5, -0.3, 0.5));
        mysteryHolo2.appendTextLine(MiscUtils.color(mysteryInfoName));
        mysteryHolo2.appendTextLine(MiscUtils.color(rightClick));

        mysteryHolo3 = HologramsAPI.createHologram(Main.getPlugin(), mysteryInfoHolo3.getLocation().add(0.5, -0.3, 0.5));
        mysteryHolo3.appendTextLine(MiscUtils.color(mysteryInfoName));
        mysteryHolo3.appendTextLine(MiscUtils.color(rightClick));

        mysteryHolo4 = HologramsAPI.createHologram(Main.getPlugin(), mysteryInfoHolo4.getLocation().add(0.5, -0.3, 0.5));
        mysteryHolo4.appendTextLine(MiscUtils.color(mysteryInfoName));
        mysteryHolo4.appendTextLine(MiscUtils.color(rightClick));
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
        staffNameText.clearChars(true);
        lelText.clearChars(true);

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

        mysteryInfo1.destroy();
        mysteryInfo2.destroy();
        mysteryInfo3.destroy();
        mysteryInfo4.destroy();

        cooltimmetjeHolo.delete();
        thothokillHolo.delete();
        swagyoloHolo.delete();

        mysteryHolo1.delete();
        mysteryHolo2.delete();
        mysteryHolo3.delete();
        mysteryHolo4.delete();

        cooltimmetje.destroy();
        thothokill.destroy();
        swagyolo.destroy();

        cooltimmetjeBat.destroy();
        thothokillBat.destroy();
        swagyoloBat.destroy();
    }

    public static void reloadStatues(){
        cooltimmetje.destroy();
        thothokill.destroy();
        swagyolo.destroy();

        cooltimmetjeBat.destroy();
        thothokillBat.destroy();
        swagyoloBat.destroy();

        isStaffNPC.clear();
        staffNPC.clear();

        cooltimmetje = registry.createNPC(EntityType.PLAYER, "Cooltimmetje");
        cooltimmetje.spawn(cooltimmetjeLoc.getLocation().add(0.5, 0, 0.5));
        cooltimmetje.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.COMMAND));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + cooltimmetje.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        cooltimmetjeBat = registry.createNPC(EntityType.BAT, "");
        cooltimmetjeBat.spawn(cooltimmetjeLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + cooltimmetjeBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        cooltimmetjeBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(cooltimmetje.getEntity(), "Cooltimmetje");
                isStaffNPC.put(cooltimmetje.getEntity(), true);
                cooltimmetje.getEntity().setPassenger(cooltimmetjeBat.getEntity());
            }
        },100);



        thothokill = registry.createNPC(EntityType.PLAYER, "ThoThoKill");
        thothokill.spawn(thothokillLoc.getLocation().add(0.5, 0, 0.5));
        thothokill.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.INK_SACK, 1, (byte) 1));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + thothokill.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        thothokillBat = registry.createNPC(EntityType.BAT, "");
        thothokillBat.spawn(thothokillLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + thothokillBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        thothokillBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(thothokill.getEntity(), "ThoThoKill");
                isStaffNPC.put(thothokill.getEntity(), true);
                thothokill.getBukkitEntity().getEquipment().setHelmet(InventoryUtils.colorArmor(Material.LEATHER_HELMET, 1, 0, null, null, Color.RED));
                thothokill.getBukkitEntity().getEquipment().setChestplate(InventoryUtils.colorArmor(Material.LEATHER_CHESTPLATE, 1, 0, null, null, Color.RED));
                thothokill.getBukkitEntity().getEquipment().setBoots(InventoryUtils.colorArmor(Material.LEATHER_BOOTS, 1, 0, null, null, Color.RED));
                thothokill.getEntity().setPassenger(thothokillBat.getEntity());
            }
        },100);

        swagyolo = registry.createNPC(EntityType.PLAYER, "SwagYoloFishMC");
        swagyolo.spawn(swagyoloLoc.getLocation().add(0.5, 0, 0.5));
        swagyolo.getBukkitEntity().getEquipment().setItemInHand(new ItemStack(Material.IRON_SWORD));
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + swagyolo.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc lookclose");

        swagyoloBat = registry.createNPC(EntityType.BAT, "");
        swagyoloBat.spawn(swagyoloLoc.getLocation());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc select " + swagyoloBat.getId());
        Bukkit.getServer().dispatchCommand(Bukkit.getConsoleSender(), "npc sound -n -n -n");
        swagyoloBat.getBukkitEntity().addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 999999999, 2));

        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run() {
                staffNPC.put(swagyolo.getEntity(), "SwagYoloFishMC");
                isStaffNPC.put(swagyolo.getEntity(), true);
                swagyolo.getEntity().setPassenger(swagyoloBat.getEntity());
            }
        },100);

    }

}
