package com.minetrone.mfurniture.api.handlers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class FurnitureBoughtEvent extends Event {

    public FurnitureBoughtEvent(Player player) {
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

    public Player getPlayer() {
        throw new MFurnitureNotInstalledExpection();
    }
}