package org.apache.maven.plugins;

import org.apache.maven.plugins.Customs.CustomTNT;
import org.apache.maven.plugins.Events.PlacedTNT;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public final class AutoTNT extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().log(Level.INFO, "Plugin is enabled");
        CustomTNT.init();
        getServer().getPluginManager().registerEvents(new PlacedTNT(), this);
    }

    @Override
    public void onDisable() {
        this.getLogger().log(Level.INFO, "Plugin is disabled");
    }
}
