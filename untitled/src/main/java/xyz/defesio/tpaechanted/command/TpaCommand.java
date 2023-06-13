package xyz.defesio.tpaechanted.command;

import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import xyz.defesio.tpaechanted.entity.User;
import xyz.defesio.tpaechanted.globals.Globals;
import xyz.defesio.tpaechanted.model.FileManager;
import org.bukkit.plugin.Plugin.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

import static org.bukkit.Bukkit.getServer;

public class TpaCommand implements CommandExecutor {


    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if(commandSender instanceof Player){

            Player player = (Player) commandSender;

            User user1 = new User();
            user1.setPlayer(player);
            Globals.players.add(user1);


            if(strings.length == 1){
                Collection<? extends Player> onlinePlayers = getServer().getOnlinePlayers();
                onlinePlayers.forEach(onlinePlayer -> {
                    if(onlinePlayer.getName() == strings[0]){
                        onlinePlayer.sendMessage(Component.text(ChatColor.RED+player.getName() + ChatColor.WHITE +" solicita um teletransporte a ti!"));
                        player.sendMessage(Component.text(ChatColor.WHITE+"Se ha enviado la solicitud a "+ChatColor.RED+strings[0]+ChatColor.WHITE+"!"));
                        User user = new User();
                        user.setPlayer(onlinePlayer);
                    }
                });
            }

        }
        return true;
    }
}
