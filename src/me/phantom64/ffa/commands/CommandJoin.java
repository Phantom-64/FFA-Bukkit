package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.GameManager;
import org.bukkit.entity.Player;

public class CommandJoin {

    public static void execute (Player p, String[] a) {

        if (a.length != 1) {
            p.sendMessage("§9Wrong usage!");
            p.sendMessage("§9Correct Usage: " + "§2/ffa join");
            return;
        } else {
            if (GameManager.isPlaying(p)) {
                p.sendMessage("§9You are already playing!");
                return;
            } else {
                GameManager.addPlayerToGame(p);
            }
        }

    }

}
