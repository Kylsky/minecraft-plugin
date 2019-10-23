package top.kyle.Executor;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import top.kyle.MyPlugin;

import java.util.logging.Logger;

/**
 * @Description:
 * @Author: Kyle
 * @Date: 2019/10/23
 */
public class MeanoCommandExecutor implements CommandExecutor {
    private final Logger logger = Bukkit.getLogger();
    private final MyPlugin myPlugin;

    public MeanoCommandExecutor(MyPlugin myPlugin){
        this.myPlugin = myPlugin;
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        //判断用户是否在线
        Player player = Bukkit.getServer().getPlayer(strings[0]);
        if (player==null){
           logger.info("User not online.");
            return false;
        }
        if (!(commandSender instanceof Player)){
            logger.info("Command sender is not a user.");
            return false;
        }else{
            logger.info("You are using a useless command!");
            return true;
        }
    }
}
