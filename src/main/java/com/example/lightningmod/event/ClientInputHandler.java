package com.example.lightningmod.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.math.InputUtil;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;

public class ClientInputHandler {
    private static final Minecraft CLIENT = Minecraft.getInstance();

    public static void register() {
        ClientLifecycleEvents.CLIENT_STARTED.register(client -> {
            ClientTickEvents.END_CLIENT_TICK.register(ClientInputHandler::onClientTick);
        });
    }

    private static void onClientTick(Minecraft client) {
        if (InputUtil.isKeyPressed(client.getWindow().getHandle(), InputUtil.KEY_A)) {
            handleKeyPress();
        }
    }

    private static void handleKeyPress() {
        // Add your input handling logic here
        System.out.println("Key A was pressed!");
    }
}