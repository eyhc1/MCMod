package me.auser;

import me.auser.listeners.Listeners;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {
    private static Main instance;

    public Main() {

    }

    public static Main getInstance() {
        return instance; //so that the plugin will know itself
    }

    @Override
    public void onEnable() {
        this.instance = this;
        this.getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        this.instance = null; //disable behaviors
    }

    @Override
    public boolean onCommand (CommandSender s, Command cmd, String str, String[] args) {
        //some command will be executed. NEED TO DECLARE IN plugin.yml
        if (cmd.getName().equalsIgnoreCase("test")) {
            s.sendMessage(ChatColor.GREEN + "Hello Server!");
        }
        return false; //DEFAULT
    }
}