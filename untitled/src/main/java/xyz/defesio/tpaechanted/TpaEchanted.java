package xyz.defesio.tpaechanted;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.defesio.tpaechanted.command.TpaAcceptCommand;
import xyz.defesio.tpaechanted.command.TpaCommand;
import xyz.defesio.tpaechanted.globals.Globals;
import xyz.defesio.tpaechanted.model.FileManager;

public final class TpaEchanted extends JavaPlugin {


    @Override
    public void onEnable() {
        getDataFolder().mkdir();
        Globals.fm = new FileManager(getDataFolder());
        getCommand("tpa").setExecutor(new TpaCommand());
        getCommand("tpaaccept").setExecutor(new TpaAcceptCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
