package com.minetrone.mfurniture.api.handlers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FurnitureShowInfoEvent extends Event {

    public FurnitureShowInfoEvent(String furniturePlugin, String furnitureNameText, String furnitureNameTextColor, String furniturePriceText, String furniturePriceTextColor, String furnitureBuyText, String furnitureBuyTextColor, String language, String fontName) {
        throw new MFurnitureNotInstalledExpection();
    }

    @Override
    public HandlerList getHandlers() {
        throw new MFurnitureNotInstalledExpection();
    }

    public static HandlerList getHandlerList() {
        throw new MFurnitureNotInstalledExpection();
    }

    public boolean isCancelled() {
        throw new MFurnitureNotInstalledExpection();
    }

    public void setCancelled(boolean cancel) {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurniturePlugin() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurnitureNameText() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurnitureNameTextColor() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurniturePriceText() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurniturePriceTextColor() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurnitureBuyText() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurnitureBuyTextColor() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getLanguage() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFontName() {
        throw new MFurnitureNotInstalledExpection();
    }
}