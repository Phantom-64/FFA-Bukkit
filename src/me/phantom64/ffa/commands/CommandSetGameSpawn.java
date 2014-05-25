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
            if (GameManager.isInt(a[1])) {
                Integer gameSpawn = Integer.parseInt(a[1]);
                if (gameSpawn <= 10 && gameSpawn >= 1) {
                    LocationUtil.setGameSpawn(p.getLocation(), gameSpawn);
                } else {
                    p.sendMessage("§9Illegal number. Bounds are from 1 to 10.");
                }
            } else {
                p.sendMessage("§9Invalid argument.");
                return;
            }
        }

    }

}
