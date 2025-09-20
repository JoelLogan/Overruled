package com.joellogan.neoforge;

import net.neoforged.fml.common.Mod;

import com.joellogan.Overruled;

@Mod(Overruled.MOD_ID)
public final class OverruledNeoForge {
    public OverruledNeoForge() {
        // Run our common setup.
        Overruled.init();
    }
}
