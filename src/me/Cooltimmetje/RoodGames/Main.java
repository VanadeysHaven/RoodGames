package me.Cooltimmetje.RoodGames;

import me.Cooltimmetje.RoodGames.Commands.GameChangeCmd;
import me.Cooltimmetje.RoodGames.Listener.JoinQuitEvent;
import me.Cooltimmetje.RoodGames.Listener.MysteryChest;
import me.Cooltimmetje.RoodGames.Utils.GameList;
import me.Cooltimmetje.RoodGames.Utils.LobbyUtils;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This class has been created on 10-4-2015 at 18:30 by cooltimmetje.
 */
public class Main extends JavaPlugin {

    private static Plugin plugin;
    public long loadStart;
    public long loadStop;
    public long loadFinal;

    public void onEnable(){
        StartLoad();
//        this.saveDefaultConfig();
        plugin = this;

        GameList.listGames();

        getLogger().info("[R00DGames] Registering Events...");
        registerEvents(this, new MysteryChest(), new JoinQuitEvent());

        getLogger().info("[R00DGames] Registering Commands...");
        getCommand("setgame").setExecutor(new GameChangeCmd());

        getLogger().info("[R00DGames] Hooking into APIs...");
        if (getServer().getPluginManager().getPlugin("TitleManager") != null && getServer().getPluginManager().getPlugin("TitleManager").isEnabled())
            getLogger().info("[R00DGames] Successfully hooked into TitleManager!");
        else {
            getLogger().warning("[R00DGames] Failed to hook into TitleManager, disabling plugin!");
            getPluginLoader().disablePlugin(this);
        }

        if (getServer().getPluginManager().getPlugin("CharsAPI") != null && getServer().getPluginManager().getPlugin("CharsAPI").isEnabled())
        getLogger().info("[R00DGames] Successfully hooked into CharsAPI!");
        else {
            getLogger().warning("[R00DGames] Failed to hook into CharsAPI, disabling plugin!");
            getPluginLoader().disablePlugin(this);
        }

        if (getServer().getPluginManager().getPlugin("HolographicDisplays") != null && getServer().getPluginManager().getPlugin("HolographicDisplays").isEnabled())
            getLogger().info("[R00DGames] Successfully hooked into HolographicDisplays!");
        else {
            getLogger().warning("[R00DGames] Failed to hook into HolographicDisplays, disabling plugin!");
            getPluginLoader().disablePlugin(this);
        }

        if (getServer().getPluginManager().getPlugin("Citizens") != null && getServer().getPluginManager().getPlugin("Citizens").isEnabled())
            getLogger().info("[R00DGames] Successfully hooked into Citizens!");
        else {
            getLogger().warning("[R00DGames] Failed to hook into Citizens, disabling plugin!");
            getPluginLoader().disablePlugin(this);
        }

        LobbyUtils.setupLobby();

        getLogger().info("[R00DGames] Done! Load time: " + loadFinal + "ms");
        StopLoad();
    }

    public static void registerEvents(Plugin plugin, Listener... listeners) {
        for(Listener listener : listeners){
            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
        }

    }

    public void onDisable(){

        plugin = null;
        getServer().resetRecipes();

        LobbyUtils.clearLobby();
    }

    public void StartLoad(){
        loadStart = System.currentTimeMillis();
    }

    public void StopLoad(){
        loadStop = System.currentTimeMillis();
        loadFinal = (loadStop - loadStart);
    }

    public static Plugin getPlugin(){
        return plugin;
    }

}
