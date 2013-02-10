package com.github.kensclark16;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class SneakListener implements Listener {
	
	@EventHandler
	public void onPlayerShift(PlayerToggleSneakEvent event) {
		
		Player player = event.getPlayer();
		
		if (player.isSneaking()) {
			Player[] players = Bukkit.getOnlinePlayers();
			
			for (Player p: players) {
				p.hidePlayer(player);
			}
			
		} else {
			
			Player[] players = Bukkit.getOnlinePlayers();
			
			for (Player p: players) {
				p.showPlayer(player);
			}
			
		}
		
	}

}
