package com.github.kensclark16;

import org.bukkit.plugin.java.JavaPlugin;

public class SneakyNinja extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		getServer().getPluginManager().registerEvents(new SneakListener(), this);
		
	}

}
