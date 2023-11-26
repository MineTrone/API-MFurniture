package com.minetrone.mfurniture.api.handlers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class FurnitureSubColorDyeEvent extends Event {

    public FurnitureSubColorDyeEvent(ItemStack item, String subColorName, String subColorHex) {
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

    public String getSubColorName() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getSubColorHex() {
        throw new MFurnitureNotInstalledExpection();
    }
}