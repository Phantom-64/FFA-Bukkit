package me.phantom64.ffa.utils;

import me.phantom64.ffa.Core;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.PlayerInventory;

import java.util.Random;

public class LocationUtil {

    public static void teleportPlayerToArena(Player p) {
        Random random = new Random();
        int num = new Random().nextInt(10);
        if (num > 0) {
            p.teleport(Core.gameSpawns[num]);
        }
    }

    public static void teleportPlayerFromArena(Player p) {
        p.teleport(Core.exitSpawn);
        p.getInventory().clear();
    }

    public static void setGameSpawn(Location loc, int i) {
        if (i <= 10 && i >= 1) {
            Core.gameSpawns[i] = loc;
        }
    }

    public static void setExitSpawn(Location loc) {
        Core.exitSpawn = loc;
    }

}
