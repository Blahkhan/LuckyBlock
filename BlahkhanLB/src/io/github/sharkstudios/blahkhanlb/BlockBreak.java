package io.github.sharkstudios.blahkhanlb;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import io.netty.util.internal.ThreadLocalRandom;
import net.md_5.bungee.api.ChatColor;

public class BlockBreak implements Listener {

	private Main main;
	HashMap<Player, Material> lb = new HashMap<Player, Material>();
	HashMap<Player, String> type = new HashMap<Player, String>();
	
	public BlockBreak(Main mi) {
		main = mi;
	}
	
	@EventHandler
	public void OnJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		lb.put(p, null);
		
	}
	
	@EventHandler
	public void OnPlaceBlock(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		Block b = e.getBlockPlaced();
		ItemStack i = e.getItemInHand();
		if(!i.hasItemMeta()) {
			return;
			
		}
		HashMap<Player, Material> check = new HashMap<Player, Material>();
		check.put(p, null);
		if(!lb.equals(check)) {
			e.setCancelled(true);
			p.sendMessage("Masz już położonego LuckyBlocka");
			return;
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlock")) {
			lb.put(p,b.getType());
			type.put(p,"");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlocklegendary")) {
			lb.put(p,b.getType());
			type.put(p,"legendary");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockboss")) {
			lb.put(p,b.getType());
			type.put(p,"boss");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockbug")) {
			lb.put(p,b.getType());
			type.put(p,"bug");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockdark")) {
			lb.put(p,b.getType());
			type.put(p,"dark");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockdragon")) {
			lb.put(p,b.getType());
			type.put(p,"dragon");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockelectrik")) {
			lb.put(p,b.getType());
			type.put(p,"electrik");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockfairy")) {
			lb.put(p,b.getType());
			type.put(p,"fairy");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockfight")) {
			lb.put(p,b.getType());
			type.put(p,"fight");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockfire")) {
			lb.put(p,b.getType());
			type.put(p,"fire");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockflying")) {
			lb.put(p,b.getType());
			type.put(p,"flying");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockghost")) {
			lb.put(p,b.getType());
			type.put(p,"ghost");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockgrass")) {
			lb.put(p,b.getType());
			type.put(p,"grass");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockground")) {
			lb.put(p,b.getType());
			type.put(p,"ground");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockice")) {
			lb.put(p,b.getType());
			type.put(p,"ice");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlocknormal")) {
			lb.put(p,b.getType());
			type.put(p,"normal");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockphysic")) {
			lb.put(p,b.getType());
			type.put(p,"physic");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockpoison")) {
			lb.put(p,b.getType());
			type.put(p,"poison");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockrock")) {
			lb.put(p,b.getType());
			type.put(p,"rock");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlocksteel")) {
			lb.put(p,b.getType());
			type.put(p,"steel");
			p.sendMessage("Work");
		}
		if(i.getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.YELLOW + "LuckyBlockwater")) {
			lb.put(p,b.getType());
			type.put(p,"water");
			p.sendMessage("Work");
		}
	}
	
	@EventHandler
	public void OnBlockBreak(BlockBreakEvent e) {
		Main main = this.main;
		Player p = e.getPlayer();
		Block b = e.getBlock();
		HashMap<Player,Material> breakLb = new HashMap<Player, Material>();
		breakLb.put(p, b.getType());
		if (lb.equals(breakLb)) {
			e.setCancelled(true);
			b.setType(Material.AIR);
			int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
			p.sendMessage(Integer.toString(randomNum));
			String listType;
			if(type.get(p).equalsIgnoreCase("")) {
				listType = "def";
			}
			else {
				listType = type.get(p);
			}
			for (String s : main.getConfig().getStringList(listType)) {
				String[] args = s.split("\\;");
				if(randomNum >= Integer.parseInt(args[2]) && randomNum <= Integer.parseInt(args[3])) {
					Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "pokespawncoords " + args[0] + p.getDisplayName() + args[1] + args[4]);
					p.sendMessage("Give Poke");
				}
			}
			p.sendMessage("Work" + type.get(p));
			lb.put(p, null);
		}

		
		
	}

}
