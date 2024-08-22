package kr.vanilage.main

import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class Main extends JavaPlugin {
  override def onEnable(): Unit = {
    Bukkit.getConsoleSender.sendMessage("Hello, World!")
  }

  override def onDisable(): Unit = {

  }
}
