package com.amazingthings.plugination.listeners;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EnderCrystal;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EntityHitEntity implements Listener {

	ItemStack is = new ItemStack(Material.DIAMOND_AXE, 1);
	ItemMeta im = is.getItemMeta();
	
	@EventHandler
	public void entityHit(EntityDamageByEntityEvent e) {
		if(e.getDamager() instanceof Player) {
			if(e.getEntity() instanceof EnderCrystal) {
				Player p = (Player) e.getDamager();
				im.setDisplayName(ChatColor.GREEN + "" + ChatColor.BOLD + "Amazing Axe");
				is.setItemMeta(im);
				p.getInventory().addItem(is);
				p.sendMessage("");
				p.sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "You Picked Up The AMAZING AXE");
				p.sendMessage("");
				Bukkit.getServer().getWorld("world").setGameRuleValue("mobGriefing", "true");
			}
		}
	}
}