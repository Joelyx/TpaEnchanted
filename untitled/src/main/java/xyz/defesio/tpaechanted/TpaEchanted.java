package xyz.defesio.tpaechanted;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.defesio.tpaechanted.command.TpaCommand;

public final class TpaEchanted extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("tpa").setExecutor(new TpaCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
