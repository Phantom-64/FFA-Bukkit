package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.GameManager;
import me.phantom64.ffa.utils.LocationUtil;
import org.bukkit.entity.Player;

public class CommandLeave {

    public static void execute(Player p, String[] a) {

        if (a.length != 1) {
            p.sendMessage("§9Wrong usage!");
            p.sendMessage("§9Correct Usage: §2/ffa leave");
            return;
        } else {
            if (!GameManager.isPlaying(p)) {
                p.sendMessage("§9You are not in a game!");
                return;
            } else {
                GameManager.removePlayerFromGame(p);
                LocationUtil.teleportPlayerFromArena(p);

                if (p.getInventory() != null) {

                    p.getInventory().setContents(CommandJoin.savedInventories.get(p.getName()));
                    p.getInventory().setArmorContents(CommandJoin.savedInventories.get(p.getName()));

                }

                return;
            }
        }

    }

}
