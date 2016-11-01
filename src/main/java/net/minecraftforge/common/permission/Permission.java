package net.minecraftforge.common.permission;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;

public class Permission {

    public static boolean isOP(EntityPlayer player) {
        return player.canCommandSenderUseCommand(2, "");
    }

    public static boolean canRenameInAnvil(InventoryPlayer inventoryPlayer) {
        return Minecraft.getMinecraft().isSingleplayer() || isOP(inventoryPlayer.player);
    }
}
