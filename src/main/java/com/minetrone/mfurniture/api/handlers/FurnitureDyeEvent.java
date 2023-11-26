package com.minetrone.mfurniture.api.handlers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class FurnitureDyeEvent extends Event {

    public FurnitureDyeEvent(ItemStack item, String colorName, String colorHex) {
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

    public ItemStack getItem() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getColorName() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getColorHex() {
        throw new MFurnitureNotInstalledExpection();
    }
}