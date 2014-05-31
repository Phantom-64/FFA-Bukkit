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

    public static void givePlayerKit(Player p) {
        PlayerInventory inv = p.getInventory();
        inv.clear();
        inv.setHelmet(new ItemStack(Material.IRON_PLATE));
        inv.setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
        inv.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        inv.setBoots(new ItemStack(Material.IRON_BOOTS));
        inv.addItem(new ItemStack(Material.IRON_SWORD));
        inv.addItem(new ItemStack(Material.BOW));
        inv.addItem(new ItemStack(Material.ARROW, 16));
    }

}
