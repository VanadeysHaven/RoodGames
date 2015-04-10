package me.Cooltimmetje.RoodGames.Utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.ArrayList;

/**
 * This class has been created on 10-4-2015 at 23:10 by cooltimmetje.
 */
public class InventoryUtils {

    public static void setInventory(Player p){
        p.getInventory().clear();

        ItemStack skull = new ItemStack(Material.SKULL_ITEM,1 ,(byte) 3);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setDisplayName(MiscUtils.color("&eYour Profile &3(Right Click)"));
        skullMeta.setOwner(p.getName());
        skull.setItemMeta(skullMeta);
        p.getInventory().setItem(0, skull);

        ItemStack chest = createItem(Material.SLIME_BALL, 1, 0, "&eCosmetics Menu &3(Right Click)", null);
        p.getInventory().setItem(7, chest);

        if(p.isOp()) {
            ItemStack admin = createItem(Material.FLINT, 1, 0, "&eAdmin Menu &3(Right Click)", null);
            p.getInventory().setItem(5, admin);
        }

        ItemStack shop = createItem(Material.EMERALD, 1, 0, "&eGame Shop &3(Right Click)", null);
        p.getInventory().setItem(1, shop);

        ItemStack prefs = createItem(Material.REDSTONE_COMPARATOR, 1, 0, "&ePreferences &3(Right Click)", null);
        p.getInventory().setItem(8, prefs);


    }


    public static ItemStack createItem(Material m, int amount, int data, String name, String lore){
        ItemStack item = new ItemStack(m, amount,(byte) data);
        ItemMeta itemMeta = item.getItemMeta();
        if(!(name == null)){
            itemMeta.setDisplayName(name.replace('&', '§'));
        }
        if(!(lore == null)){
            ArrayList<String> Lore = new ArrayList<String>();
            Lore.add(lore.replace('&', '§'));
            itemMeta.setLore(Lore);
        }
        item.setItemMeta(itemMeta);
        return item;
    }

}
