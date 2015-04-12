package me.Cooltimmetje.RoodGames.Listener;

import me.Cooltimmetje.RoodGames.Utils.ChatUtils;
import me.Cooltimmetje.RoodGames.Utils.InventoryUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;

import java.util.HashMap;

/**
 * This class has been created on 11-4-2015 at 12:21 by cooltimmetje.
 */
public class BeaconColor implements Listener,CommandExecutor{

    static HashMap<String, Location> selectedBeacon = new HashMap<String, Location>();

    @EventHandler
    public void onRightClick(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if(event.getClickedBlock() != null){
            if(event.getAction() != Action.LEFT_CLICK_AIR || event.getAction() != Action.LEFT_CLICK_BLOCK) {
                if (event.getClickedBlock().getType() == Material.STAINED_GLASS || event.getClickedBlock().getType() == Material.COBBLESTONE) {
                    if (Bukkit.getWorld("Minigames").getBlockAt(event.getClickedBlock().getLocation().add(0,-1,0)).getType() == Material.BEACON){
                        selectedBeacon.put(p.getName(), event.getClickedBlock().getLocation());
                        openColor(p);
                    }
                }
            } else {
                return;
            }
        } else {
            return;
        }
    }

    private void openColor(Player p) {
        Inventory inv = Bukkit.createInventory(null, 18, "Set beacon color");

        int i;
        for(i=0; i<16; i++){
            InventoryUtils.createDisplay(Material.STAINED_GLASS, 1, i, null, null, inv, i + 1);
        }

        InventoryUtils.createDisplay(Material.COBBLESTONE, 1, 0, "&cDisable Beacon", null, inv, 18);

        p.openInventory(inv);
    }


    @EventHandler
    @SuppressWarnings("unused")
    public void onInventoryClick(InventoryClickEvent event){
        Inventory inv = event.getInventory();

        if(!ChatColor.stripColor(event.getInventory().getName()).equalsIgnoreCase("Set beacon color"))
            return;

        Player p = (Player) event.getWhoClicked();
        event.setCancelled(true);

        switch (event.getCurrentItem().getType()){
            case STAINED_GLASS:
                ChatUtils.msgPlayer("&eColor changed!", p);
                Block block = Bukkit.getWorld("Minigames").getBlockAt(selectedBeacon.get(p.getName()));
                block.setType(Material.STAINED_GLASS);
                block.setData((byte)event.getCurrentItem().getDurability());
                p.closeInventory();
                selectedBeacon.remove(p.getName());
                break;
            case COBBLESTONE:
                ChatUtils.msgPlayer("&eBeacon disabled!",p);
                Block block2 = Bukkit.getWorld("Minigames").getBlockAt(selectedBeacon.get(p.getName()));
                block2.setType(Material.COBBLESTONE);
                p.closeInventory();
                selectedBeacon.remove(p.getName());
                break;
            default:
                break;
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (cmd.getLabel().equalsIgnoreCase("createbeacon")) {
            if(p.isOp()){
                ChatUtils.msgPlayer("&eYou have been given a beacon, place it &lON TOP &eof where the &lGLASS &ehas to be.", p);
                p.getInventory().addItem(InventoryUtils.createItem(Material.BEACON, 1, 0, "&eCreate Beacon &3(Right Click)", null));
            } else {
                ChatUtils.msgPlayer("&cYou can't do this!", p);
            }
        }
        return true;
    }

    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event){
        Player p = event.getPlayer();
        if(event.getBlock().getType() == Material.BEACON && event.getBlock().getType() != null){
            if(p.getItemInHand().hasItemMeta()) {
                event.setCancelled(true);
                p.getInventory().remove(p.getItemInHand());
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(0,-1,0).getBlock().setType(Material.STAINED_GLASS);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(0,-2,0).getBlock().setType(Material.BEACON);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(0,-3,0).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(-1,-3,0).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(1,-3,0).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(0,-3,-1).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(0,-3,1).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(1,-3,-1).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(-1,-3,1).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(1,-3,1).getBlock().setType(Material.IRON_BLOCK);
                Bukkit.getWorld("Minigames").getBlockAt(event.getBlock().getLocation()).getLocation().add(-1,-3,-1).getBlock().setType(Material.IRON_BLOCK);
                ChatUtils.msgPlayer("&eBeacon created! Right click the glass to change the color!", p);
            }
        } else {
            return;
        }
    }


}
