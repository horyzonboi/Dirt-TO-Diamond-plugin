package net.horyzon.permissions;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class EventListener implements Listener {
    @EventHandler
    public void onDirtPlacedEvent(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        if (!player.hasPermission("permission.dirtdiamond.replace")) {
            return;
        }
        if (!(event.getBlockPlaced().getType() == Material.DIRT)) {
            return;
        }
        event.getBlockPlaced().setType(Material.DIAMOND_BLOCK);
    }
}