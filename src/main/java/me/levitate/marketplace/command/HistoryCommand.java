package me.levitate.marketplace.command;

import me.levitate.acf.BaseCommand;
import me.levitate.acf.annotation.CommandAlias;
import me.levitate.acf.annotation.CommandPermission;
import me.levitate.acf.annotation.Default;
import me.levitate.quill.injection.annotation.Module;
import org.bukkit.entity.Player;

@Module
@CommandAlias("transactions")
@CommandPermission("marketplace.history")
public class HistoryCommand extends BaseCommand {

    @Default
    private void onHistory(Player player) {

    }

}
