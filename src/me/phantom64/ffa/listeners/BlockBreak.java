package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockBreak implements Listener {

    @EventHandler
    public void onBreak (BlockBreakEvent e) {
        if (GameManager.isPlaying(e.getPlayer())) {
            e.setCancelled(true);
        }
    }

}
