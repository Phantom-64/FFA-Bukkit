package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class AsyncPlayerChat implements Listener {

    @EventHandler
    public void onChat (AsyncPlayerChatEvent e) {
        if (GameManager.isPlaying(e.getPlayer())) {
            e.setFormat("§3§l[§c§lFFA§3§l " + e.getFormat());
        }
    }

}
