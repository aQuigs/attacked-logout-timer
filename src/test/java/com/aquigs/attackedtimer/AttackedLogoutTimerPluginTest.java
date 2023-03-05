package com.aquigs.attackedtimer;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AttackedLogoutTimerPluginTest {
    public static void main(String[] args) throws Exception {
        ExternalPluginManager.loadBuiltin(AttackedLogoutTimerPlugin.class);
        RuneLite.main(args);
    }
}
