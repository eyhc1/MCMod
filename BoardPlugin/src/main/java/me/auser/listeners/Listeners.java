package me.auser.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class Listeners implements Listener {
    public Listeners() {
        //some constructor
    }

    @EventHandler
    public void chatMsg (PlayerChatEvent e){
        if (e.getMessage().equalsIgnoreCase("hi")) {
            e.getPlayer().sendMessage(ChatColor.AQUA + "Message received!");
        }
    }
}
