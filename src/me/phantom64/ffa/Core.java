package me.phantom64.ffa;

import me.phantom64.ffa.commands.*;
import me.phantom64.ffa.listeners.*;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class Core extends JavaPlugin {

    public static List<Player> ingame = new ArrayList<Player>();

    public static Location[] gameSpawns;
    public static Location exitSpawn;

    public void onEnable() {
        getServer().getPluginManager().registerEvents(new BlockListener(), this);
        getServer().getPluginManager().registerEvents(new EntityDamage(), this);
        getServer().getPluginManager().registerEvents(new FoodLevelChange(), this);
        getServer().getPluginManager().registerEvents(new AsyncPlayerChat(), this);
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (label.equalsIgnoreCase("ffa")) {

            if (sender instanceof Player) {

                if (args[0].equalsIgnoreCase("join")) {
                    CommandJoin.execute((Player) sender, args);
                } else if (args[0].equalsIgnoreCase("leave")) {
                    CommandLeave.execute((Player) sender, args);
                } else if (args[0].equalsIgnoreCase("setgamespawn")) {
                    CommandSetGameSpawn.execute((Player) sender, args);
                } else if (args[0].equalsIgnoreCase("setexitspawn")) {
                    CommandSetExitSpawn.execute((Player) sender, args);
                } else if (args[0].equalsIgnoreCase("kickall")) {
                    CommandKickAll.execute((Player) sender, args);
                }

            } else {

                sender.sendMessage(ChatColor.RED + "Only players can use this command.");

            }

        }

        return true;

    }

}
