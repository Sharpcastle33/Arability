package com.gmail.sharpcastle33.arability;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.World;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config {
  
  //All of this is broken and should probably be started over from scratch.
		
	public static String worldName;
	//
	private static Map<String, FileConfiguration> configurations;
	//private static ArrayList<String> allowedSeeds;
	

	
	private Config(){
		configurations = new HashMap<String, FileConfiguration>();
		//allowedSeeds = new ArrayList<String>();
	}
	
	/*public static void loadConfig(){
		for (World world : Arability.plugin.getServer().getWorlds()){
			File saveFile = new File(Arability.plugin.getDataFolder(), String.format("%s-config.yml", world.getName()));
			Arability.plugin.getLogger().info("Loading configs for world: " + world.getName());
			if(saveFile.exists()){
				try(Reader worldExistsReader = new FileReader(saveFile)){
					configurations.put(world.getName(), YamlConfiguration.loadConfiguration(worldExistsReader));
				}catch(IOException ioe){
					Arability.plugin.getLogger().warning(String.format("A YAML file could not be found for the world named %s.", world.getName()));
				}
			}else{
				Arability.plugin.getLogger().warning(String.format("A YAML file could not be found for the world named %s, generating one.", world.getName()));
				//TODO generate configs
			}
			loadWorldConfig(configurations.get(world.getName()));
		}
	}
	
	public static void loadWorldConfig(FileConfiguration file){
		
		//TODO how the fuck does this work???
		Config i = new Config();
		//this too
		//worldName = file.getString("world_name");
		
		ConfigurationSection seeds = file.getConfigurationSection("seeds");
		
		instance = i;
		
		/*
		 * PROBLEM WITH HIDDENORE? THERE IS ONLY ONE INSTANCE AND AFTER EVERY DOLOADWORLDCONFIG, INSTANCE = I;
		 * 
		 * THIS LOOKS REALLY WRONG BECAUSE ALL BLOCK DROPS ARE DONE THROUGH INSTANCE. HOW DOES INSTANCE WORK
		 * 
		 * Yeah this looks like normal hiddenore, because devoted hiddenore has one instance. We need multiple instances per world and choose each based on breaks.
		 * 
		 * 
		 * 
		 */
	

}



