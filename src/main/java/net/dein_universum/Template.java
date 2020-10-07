package net.dein_universum;

import org.bukkit.Server.Spigot;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin {
	@Override
	public void onEnable() {
		super.onEnable();

		getCommand("du").setExecutor(new CommandExecutor() {		
			@Override
			public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
				if (sender instanceof Player) {
					Player player = ((Player) sender);
					player.sendMessage("Hello World!");
					return true; 
				}
				
				if (sender instanceof ConsoleCommandSender) {
					getLogger().info("Hello console!");
				}
				return false;
			}
		});
	}	
}
