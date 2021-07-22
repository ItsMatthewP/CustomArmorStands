package com.itsmatthewp.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		System.out.println("------------------------------------");
		System.out.println("Custom Armor Stands Plugin Enabled!");
		System.out.println("------------------------------------");
		
		getCommand("scas").setExecutor(new ScasCommand());
		
	}
	
	@Override
	public void onDisable() {
		
		System.out.println("------------------------------------");
		System.out.println("Custom Armor Stands Plugin Disabled!");
		System.out.println("------------------------------------");
	}
	
	
}
