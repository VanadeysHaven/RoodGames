package me.Cooltimmetje.RoodGames.Listener;

import me.Cooltimmetje.RoodGames.Utils.InventoryUtils;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import me.Cooltimmetje.RoodGames.Utils.MiscUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

/**
 * This class has been created on 11-4-2015 at 21:33 by cooltimmetje.
 */
public class MysteryBoxInfo implements Listener {

    @EventHandler
    public void onEntityInteractEvent(PlayerInteractEntityEvent event){
        Player p = event.getPlayer();
        if(LobbyUtils.isMI.contains(event.getRightClicked())){
                openMysteryInfo(p);
        }
    }

    private void openMysteryInfo(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Mystery Box Info");

        InventoryUtils.createDisplay(Material.CHEST, 1, 0, "&eCommon Box Info", "&7Click to learn more about the Common Box.", inv, 3);
        InventoryUtils.createDisplay(Material.TRAPPED_CHEST, 1, 0, "&eRare Box Info", "&7Click to learn more about the Rare Box.", inv, 5);
        InventoryUtils.createDisplay(Material.ENDER_CHEST, 1, 0, "&eLegendary Box Info", "&7Click to learn more about the Legendary Box.", inv, 7);

         p.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event){

        if(!ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Mystery Box Info"))
            return;

        Player p = (Player) event.getWhoClicked();
        event.setCancelled(true);

        if(!event.getCurrentItem().hasItemMeta()){
            return;
        }

        switch (event.getCurrentItem().getType()){
            case CHEST:
                    openCommonInfo(p);
                break;
            case TRAPPED_CHEST:
                    openRareInfo(p);
                break;
            case ENDER_CHEST:
                    openLegendaryInfo(p);
                break;
            default:
                break;
        }
    }

    @EventHandler
    public void onInventoryClick2(InventoryClickEvent event) {

        if (ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Legendary Box Info") ||
                ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Rare Box Info") ||
                ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Common Box Info")) {

            Player p = (Player) event.getWhoClicked();
            event.setCancelled(true);

            if (!event.getCurrentItem().hasItemMeta()) {
                return;
            }

            switch (event.getCurrentItem().getType()) {
                case ARROW:
                    openMysteryInfo(p);
                    break;
                default:
                    break;
            }
        } else {
            return;
        }

    }

    private void openLegendaryInfo(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Legendary Box Info");
        InventoryUtils.createDisplay(Material.ARROW, 1, 0, "&cGo back", null, inv, 1);

        InventoryUtils.createDisplay(Material.ENDER_CHEST, 1, 0, "&eHow to obtain", "&7You can obtain a Legendary Box by:", inv, 4);
        InventoryUtils.createDisplay(Material.DIAMOND, 1, 0, "&eRewards", "&7A Legendary Box can contain:", inv, 6);

        p.openInventory(inv);
    }

    private void openRareInfo(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Rare Box Info");
        InventoryUtils.createDisplay(Material.ARROW, 1, 0, "&cGo back", null, inv, 1);

        InventoryUtils.createDisplay(Material.TRAPPED_CHEST, 1, 0, "&eHow to obtain", "&7You can obtain a Rare Box by:", inv, 4);
        InventoryUtils.createDisplay(Material.DIAMOND, 1, 0, "&eRewards", "&7A Rare Box can contain:", inv, 6);

        p.openInventory(inv);
    }

    private void openCommonInfo(Player p) {
        Inventory inv = Bukkit.createInventory(null, 9, "Common Box Info");
        InventoryUtils.createDisplay(Material.ARROW, 1, 0, "&cGo back", null, inv, 1);

        ItemStack obtain = new ItemStack(Material.CHEST);
        ItemMeta obtainMeta = obtain.getItemMeta();
        obtainMeta.setDisplayName(MiscUtils.color("&eHow to obtain"));
        ArrayList<String> obtainLore = new ArrayList<String>();
        obtainLore.add(MiscUtils.color("&7You can obtain a Common Box by:"));
        obtainLore.add(MiscUtils.color("&b- &3Play games: &8&o10% chance to get 1 &f/ &8&o1% chance to get 2")); //TODO: Chance
        obtainLore.add(MiscUtils.color("&b- &3Buy one: &8&oOne box costs: &6&o100 coins")); //TODO: Price
        obtainLore.add(MiscUtils.color("&b- &3Do quests: &8&oAmount depends on quest"));
        obtainLore.add(MiscUtils.color("&b- &3Get them: &8&oOther players can give their boxes to you!"));
        obtainMeta.setLore(obtainLore);
        obtain.setItemMeta(obtainMeta);
        inv.setItem(4 - 1, obtain);

        ItemStack reward = new ItemStack(Material.DIAMOND);
        ItemMeta rewardMeta = reward.getItemMeta();
        rewardMeta.setDisplayName(MiscUtils.color("&eRewards"));
        ArrayList<String> rewardLore = new ArrayList<String>();
        rewardLore.add(MiscUtils.color("&7A Common Box can contain:"));
        rewardLore.add(MiscUtils.color("&b- &3Armor: &8&oOnly leather and chain. 10% chance for any piece!"));
        rewardLore.add(MiscUtils.color("&b- &3Gadgets: &8&o10% chance for any Gadget!"));
        rewardLore.add(MiscUtils.color("&b- &3Ammo: &8&o20% chance for 1 - 50 ammo for any ammo gadget!"));
        rewardLore.add(MiscUtils.color("&b- &3Rare Box: &8&o5% chance for 1 box"));
        rewardLore.add(MiscUtils.color("&b- &3Coins: &8&o55% chance for 100 - 1000 coins."));
        rewardMeta.setLore(rewardLore);
        reward.setItemMeta(rewardMeta);
        inv.setItem(6 - 1, reward);

        p.openInventory(inv);
    }

}

