package com.minetrone.mfurniture;

public class MFurnitureNotInstalledExpection extends UnsupportedOperationException {

    public MFurnitureNotInstalledExpection() {
        super("ERROR: MFurniture is not installed! Please install it first to use this API!");
    }

}