package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.GameManager;
import me.phantom64.ffa.utils.LocationUtil;
import org.bukkit.entity.Player;

public class CommandSetGameSpawn {

    public static void execute (Player p, String[] a) {

        if (!p.isOp()) {
            p.sendMessage("§9You don't have permission to execute this command.");
            return;
        }

        if (a.length != 2) {
            p.sendMessage("§9Wrong usage!");
            p.sendMessage("§9Correct usage: §2/ffa setgamespawn <number>");
            return;
        } else {

            try {
                int gameSpawn = Integer.parseInt(a[1]);
                if (gameSpawn <= 10 && gameSpawn >= 1) {
                    LocationUtil.setGameSpawn(p.getLocation(), gameSpawn);
                    p.sendMessage("§9Gamespawn " + gameSpawn + " set!");
                } else {
                    p.sendMessage("§9Invalid number. Bounds are from 1 to 10.");
                }
            } catch (NumberFormatException nfe) {
                p.sendMessage("§9Invalid argument. Enter a number instead. Bounds are from 1 to 10.");
            }

        }

    }

}
