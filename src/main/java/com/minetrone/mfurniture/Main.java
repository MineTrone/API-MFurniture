package com.minetrone.mfurniture;

public class Main {

    public static Main getInstance() {
        throw new MFurnitureNotInstalledExpection();
    }
}