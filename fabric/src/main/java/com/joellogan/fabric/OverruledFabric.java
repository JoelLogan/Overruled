package com.joellogan.fabric;

import net.fabricmc.api.ModInitializer;

import com.joellogan.Overruled;

public final class OverruledFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        // Run our common setup.
        Overruled.init();
    }
}
