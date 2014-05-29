package me.phantom64.ffa.commands;

import me.phantom64.ffa.utils.GameManager;
import me.phantom64.ffa.utils.LocationUtil;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class CommandJoin {

    public static Map<String, ItemStack[]> savedInventories = new HashMap<String, ItemStack[]>();

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

                ItemStack[] inventory = p.getInventory().getContents();
                ItemStack[] saveInventory = new ItemStack[inventory.length];

                ItemStack[] armor = p.getInventory().getArmorContents();
                ItemStack[] saveArmor = new ItemStack[armor.length];

                for(int i = 0; i < inventory.length; i++) {
                    if(inventory[i] != null) {
                        saveInventory[i] = inventory[i].clone();
                    }
                }

                for(int i = 0; i < armor.length; i++) {
                    if(armor[i] != null) {
                        saveArmor[i] = armor[i].clone();
                    }
                }

                savedInventories.put(p.getName(), saveInventory);
                savedInventories.put(p.getName(), saveArmor);

                GameManager.addPlayerToGame(p);
                LocationUtil.teleportPlayerToArena(p);
            }
        }

    }

}
