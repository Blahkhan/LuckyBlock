package io.github.sharkstudios.blahkhanlb;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_12_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_12_R1.Item;
import net.minecraft.server.v1_12_R1.MinecraftKey;

public class GiveLb implements CommandExecutor {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg) {
		if(sender instanceof Player) {
			Player p = (Player) sender;
			if (arg.length == 2) {
				Player target = Bukkit.getServer().getPlayer(arg[0]);
				if(target != null) {
					MinecraftKey mk = new MinecraftKey("luckyblock:lb");
					ItemStack lb = CraftItemStack.asNewCraftStack(Item.REGISTRY.get(mk));
					ItemMeta lbMeta = lb.getItemMeta();
					lbMeta.setDisplayName(ChatColor.YELLOW + "LuckyBlock");
					lb.setItemMeta(lbMeta);
					lb.setAmount(Integer.parseInt(arg[1]));
					target.getInventory().addItem(lb);
				}
				else {
					p.sendMessage(arg[0] + " isn't Online");
				}
			}
			else if(arg.length == 3) {
				Player target = Bukkit.getServer().getPlayer(arg[0]);
				if(target != null) {
					MinecraftKey mk = new MinecraftKey("luckyblock:lb" + arg[1]);
					ItemStack lb = CraftItemStack.asNewCraftStack(Item.REGISTRY.get(mk));
					ItemMeta lbMeta = lb.getItemMeta();
					lbMeta.setDisplayName(ChatColor.YELLOW + "LuckyBlock" + arg[1]);
					lb.setItemMeta(lbMeta);
					lb.setAmount(Integer.parseInt(arg[2]));
					target.getInventory().addItem(lb);
				}
				else {
					p.sendMessage(arg[0] + " isn't Online");
				}
			}else {
				p.sendMessage("Wrong arguments number");

			}
			return true;
			
		}
		return false;
	}

}
