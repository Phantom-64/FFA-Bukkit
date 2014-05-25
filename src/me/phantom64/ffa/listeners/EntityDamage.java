package me.phantom64.ffa.listeners;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class EntityDamage implements Listener {

    @EventHandler
    public void onEntityDamage(EntityDamageEvent e) {
        if (e.getEntity() instanceof Player) {
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
                if (GameManager.isPlaying((Player)e.getEntity())) {
                    e.setCancelled(true);
                }
            }
        }
    }

}
