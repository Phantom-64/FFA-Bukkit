package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

public class FoodLevelChange implements Listener {

    @EventHandler
    public void onFoodLevelChange (FoodLevelChangeEvent e) {
        if (e.getEntity() instanceof Player) {
            if (GameManager.isPlaying((Player) e.getEntity())) {
                e.setCancelled(true);
            }
        }
    }

}
