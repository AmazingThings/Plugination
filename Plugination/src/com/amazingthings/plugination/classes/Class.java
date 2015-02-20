package com.amazingthings.plugination.classes;

import org.bukkit.entity.Player;

import com.amazingthings.plugination.SettingsManager;

public class Class {

	public String className;
	public int classId;
	SettingsManager setting = SettingsManager.getInstance();
	
	public String getClassName() {
		
		return this.className;
	}
	
	public int getClassId() {
		
		return this.classId;
	}
	
	public String setClassName(String name) {
		
		return this.className = name;
	}
	
	public int setClassId(int id) {
		
		return this.classId = id;
	}
	
	public void getPlayerClass(Player p) {
		setting.getClasses().getString(p.getName(), "class");
	}
	
	public void init() {
		this.setClassId(classId);
		this.setClassName(className);
	}
}
