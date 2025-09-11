package com.joellogan.overruled;

import net.fabricmc.api.ModInitializer;

public class OverruledFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Overruled.init();
    }
}
