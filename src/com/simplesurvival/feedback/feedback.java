package com.simplesurvival.feedback;
import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class feedback extends JavaPlugin {


    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("feedback")) {
            sender.sendMessage("Link: https://goo.gl/forms/i19zKKegrJ7d6cEf1");
            return true;
        }
        return false;
    }
   
}