package net.horyzon.permissions;

import org.bukkit.plugin.java.JavaPlugin;

public final class Permissions extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(), this);


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
