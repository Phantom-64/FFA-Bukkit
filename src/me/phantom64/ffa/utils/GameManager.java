package me.phantom64.ffa.utils;

import me.phantom64.ffa.Core;
import org.bukkit.entity.Player;

public class GameManager {

    public static void addPlayerToGame(Player p) {
        Core.ingame.add(p);
        p.sendMessage("§9You joined the game!");
    }

    public static void removePlayerFromGame(Player p) {
        Core.ingame.remove(p);
    }

    public static boolean isPlaying(Player p) {
        return Core.ingame.contains(p);
    }

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}