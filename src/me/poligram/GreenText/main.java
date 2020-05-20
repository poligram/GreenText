package me.poligram.GreenText;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public class Listeners implements Listener {
		@EventHandler
		public void onChat(AsyncPlayerChatEvent e) {
			String message = e.getMessage();
			if(message.startsWith(">")) {
				e.setMessage(ChatColor.GREEN + message);
			}
		}
	}

}
