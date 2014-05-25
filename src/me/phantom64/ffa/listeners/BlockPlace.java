package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {

    @EventHandler
    public void onPlace (BlockPlaceEvent e) {
        if (GameManager.isPlaying(e.getPlayer())) {
            e.setCancelled(true);
        }
    }

}
