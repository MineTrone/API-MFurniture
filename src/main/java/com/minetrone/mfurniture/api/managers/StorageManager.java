package com.minetrone.mfurniture.api.managers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import de.leonhard.storage.Config;
import de.leonhard.storage.Json;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class StorageManager {

    /*
     * @param fileName name of the file
     * @return Config
     * @see Config
     */
    public Config initConfig(String fileName) {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Initiating lang file into lang folder
     *
     * @param fileName name of the file
     * @return Config
     * @see Config
     */
    public Config initLangFile(String fileName) {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Initiating config file for addons
     *
     * @param fileName name of the file
     * @param plugin  plugin instance
     * @return Config
     * @see Config
     */
    public Config initConfig(String fileName, @NotNull JavaPlugin plugin) {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Initiating json file
     *
     * @param fileName name of the file
     * @return Json
     * @see Json
     */
    public Json initJson(String fileName) {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Initiating json file
     *
     * @param fileName name of the file
     * @param plugin main class of project
     * @return Json
     * @see Json
     */
    public Json initJson(String fileName, @NotNull JavaPlugin plugin) {
        throw new MFurnitureNotInstalledExpection();
    }
}