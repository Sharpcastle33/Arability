package com.gmail.sharpcastle33.arability;

import java.util.ArrayList;
import org.bukkit.plugin.java.JavaPlugin;
import com.gmail.sharpcastle33.arability.listeners.SeedListener;

public class Arability extends JavaPlugin {

  private static SeedListener seedHandler;
  public static Arability plugin;
  
  public static ArrayList<Config> configInstances;

  public void onEnable() {

    plugin = this;

    loadConfig();

    seedHandler = new SeedListener();
    this.getServer().getPluginManager().registerEvents(seedHandler, this);
  }

  public void onDisable() {

  }

}
