package com.amazingthings.plugination.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.amazingthings.plugination.SettingsManager;

public class TestCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command c, String arg2,
			String[] args) {

		if(c.getName().equalsIgnoreCase("test")) {
			if(!(sender instanceof Player)) {
				sender.sendMessage("._.");
				sender.sendMessage("Test is a" + SettingsManager.getInstance().getClasses().get("test", "class"));
			}else {
				sender.sendMessage("You must be da console to do dis.");
			}
			
		}
		return false;
	}

}
