package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.LocationUtil;
import org.bukkit.entity.Player;

public class CommandSetExitSpawn {

    public static void execute (Player p, String[] a) {

        if (!p.isOp()) {
            p.sendMessage("§9You don't have permission to execute this command.");
            return;
        }

        if (a.length != 1) {
            p.sendMessage("§9Wrong usage!");
            p.sendMessage("§9Correct usage: §2/ffa setexitspawn");
            return;
        } else {
            LocationUtil.setExitSpawn(p.getLocation());
            p.sendMessage("§9Exit spawn set!");
        }

    }

}
