package io.github.sharkstudios.blahkhanlb;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public YamlConfiguration yamlFile;

	@Override
	public void onEnable() {
		this.saveDefaultConfig();
		this.getConfig().options().copyDefaults(true);
		getServer().getPluginManager().registerEvents(new BlockBreak(this), this);
		this.getCommand("givelb").setExecutor(new GiveLb());
	}
	
}
