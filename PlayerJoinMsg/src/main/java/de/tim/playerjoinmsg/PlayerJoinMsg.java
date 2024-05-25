package de.tim.playerjoinmsg;

import de.tim.playerjoinmsg.listener.OnJoin;
import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerJoinMsg extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new OnJoin(), this);

        

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
