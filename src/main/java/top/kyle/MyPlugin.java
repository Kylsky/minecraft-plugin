package top.kyle;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import top.kyle.Executor.MeanoCommandExecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Kyle
 * @Date: 2019/10/22
 */
public class MyPlugin extends JavaPlugin {
    Map<String,Player> playerMap = new HashMap<>();

    @Override
    public void onEnable() {
        getLogger().info("onEnable has been invoked!");
        Bukkit.getServer().getOnlinePlayers().stream().forEach(player->playerMap.put(player.getName(),player));
        this.getCommand("/meano").setExecutor(new MeanoCommandExecutor(this));
    }

    @Override
    public void onDisable() {
        getLogger().info("onDisable has been invoked!");
    }

}
