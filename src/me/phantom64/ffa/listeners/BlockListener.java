package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

    @EventHandler
    public void onBreak (BlockBreakEvent e) {
        if (GameManager.isPlaying(e.getPlayer())) {
            e.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlace (BlockPlaceEvent e) {
        if (GameManager.isPlaying(e.getPlayer())) {
            e.setCancelled(true);
        }
    }

}
