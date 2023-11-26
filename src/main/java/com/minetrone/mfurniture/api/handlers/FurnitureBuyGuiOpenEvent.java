package com.minetrone.mfurniture.api.handlers;

import com.minetrone.mfurniture.MFurnitureNotInstalledExpection;
import de.themoep.inventorygui.InventoryGui;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;

public class FurnitureBuyGuiOpenEvent extends Event {

    public FurnitureBuyGuiOpenEvent(Player player, ItemStack furnitureItem, String furnitureName, int furniturePrice, InventoryGui gui) {
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

    public ItemStack getFurnitureItem() {
        throw new MFurnitureNotInstalledExpection();
    }

    public String getFurnitureName() {
        throw new MFurnitureNotInstalledExpection();
    }

    public int getFurniturePrice() {
        throw new MFurnitureNotInstalledExpection();
    }

    public InventoryGui getGui() {
        throw new MFurnitureNotInstalledExpection();
    }
}