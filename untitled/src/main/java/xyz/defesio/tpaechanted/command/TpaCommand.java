package xyz.defesio.tpaechanted.command;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

import static org.bukkit.Bukkit.getServer;

public class TpaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player){
            Player player = (Player) commandSender;

            if(strings.length == 1){
                Collection<? extends Player> onlinePlayers = getServer().getOnlinePlayers();
                onlinePlayers.forEach(onlinePlayer -> {
                    if(onlinePlayer.getName() == strings[0]){
                        onlinePlayer.sendMessage(Component.text(ChatColor.RED+player.getName() + ChatColor.WHITE +" solicita um teletransporte a ti!"));
                    }
                });
            }

        }
        return true;
    }
}
