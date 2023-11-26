package com.minetrone.mfurniture.api;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import com.minetrone.mfurniture.Main;
import com.minetrone.mfurniture.api.managers.AdventureManager;
import com.minetrone.mfurniture.api.managers.StorageManager;

public class FurnitureAPI {

   /**
     * Returns instance of Main class
     * @return Main instance
     * @see Main
     */
    public static Main getInstance() {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Storage manager for config and json files.
     * @see StorageManager
     * @return StorageManager
     */
    public static StorageManager getStorageManager() {
        throw new MFurnitureNotInstalledExpection();
    }

    /**
     * Adventure manager for adventure mode.
     * @see AdventureManager
     * @return AdventureManager
     */
    public static AdventureManager getAdventureManager() {
        throw new MFurnitureNotInstalledExpection();
    }
}