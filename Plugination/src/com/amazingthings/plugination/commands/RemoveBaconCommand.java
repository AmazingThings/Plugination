package com.amazingthings.plugination.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.amazingthings.plugination.SettingsManager;
import com.amazingthings.plugination.events.SpawnBacon;

public class RemoveBaconCommand implements CommandExecutor{

	SettingsManager setting = SettingsManager.getInstance();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String s,
			String[] args) {
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("removebacon")) {
			
			SpawnBacon.removeBacon(
					setting.getClasses().getInt("location.bacon.x"),
					setting.getClasses().getInt("location.bacon.y"),
					setting.getClasses().getInt("location.bacon.z"),
					player.getWorld());
		}
		return false;
	}

}
