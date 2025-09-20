package com.joellogan.fabric.client;

import net.fabricmc.api.ClientModInitializer;

public final class OverruledFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
    }
}
