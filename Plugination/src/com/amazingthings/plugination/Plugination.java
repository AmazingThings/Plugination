package com.amazingthings.plugination;

import org.bukkit.plugin.java.JavaPlugin;

import com.amazingthings.plugination.commands.BaconCommand;
import com.amazingthings.plugination.commands.RemoveBaconCommand;
import com.amazingthings.plugination.commands.TestCommand;
import com.amazingthings.plugination.listeners.EntityHitEntity;

public class Plugination extends JavaPlugin {

	SettingsManager setting = SettingsManager.getInstance();
	
	public void onEnable() {
		setting.setup(this);

		this.getCommand("test").setExecutor(new TestCommand());
		this.getCommand("bacon").setExecutor(new BaconCommand());
		this.getCommand("removebacon").setExecutor(new RemoveBaconCommand());
		this.getServer().getPluginManager().registerEvents(new EntityHitEntity(), this);
		
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new SnowballBoom(), 20, 20);
	}
	
	public void onDisable() {
		
	}
}
