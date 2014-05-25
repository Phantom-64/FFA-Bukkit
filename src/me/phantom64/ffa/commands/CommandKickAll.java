package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.GameManager;
import me.phantom64.ffa.utils.LocationUtil;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CommandKickAll {

    public static void execute(Player p, String[] a) {

        if (!p.isOp()) {
            p.sendMessage("§9You don't have permission to execute this command.");
            return;
        }

        if (a.length != 1) {
            p.sendMessage("§9Wrong usage!");
            p.sendMessage("§9Correct usage: §2/ffa kickall");
        } else {
            for (Player pl : Bukkit.getServer().getOnlinePlayers()) {
                if (GameManager.isPlaying(pl)) {
                    GameManager.removePlayerFromGame(pl);
                    LocationUtil.teleportPlayerFromArena(pl);
                    pl.sendMessage("§9Everyone was kicked from the game by an Admin.");
                }
            }
            p.sendMessage("§9All the players were kicked from the game.");
        }

    }

}
