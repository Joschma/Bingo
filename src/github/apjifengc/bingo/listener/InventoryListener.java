package github.apjifengc.bingo.listener;

import github.apjifengc.bingo.Bingo;
import github.apjifengc.bingo.inventory.BingoGuiInventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public final class InventoryListener implements Listener {

	public InventoryListener(Bingo plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent event) {
		if (event.getClickedInventory() != null) {
			if (event.getClickedInventory().getHolder() != null && event.getPlayer.getWorld.getName().equalsIngorecase(Configs.getMainCfg().getString("room.world-name"))
					&& event.getClickedInventory().getHolder() instanceof BingoGuiInventory) {
				event.setCancelled(true);
			}
		}
	}

}
