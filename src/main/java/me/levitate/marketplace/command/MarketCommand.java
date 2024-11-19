package me.levitate.marketplace.command;

import me.levitate.acf.BaseCommand;
import me.levitate.acf.annotation.CommandAlias;
import me.levitate.acf.annotation.CommandPermission;
import me.levitate.acf.annotation.Default;
import me.levitate.marketplace.menu.MarketMenu;
import me.levitate.quill.injection.annotation.Inject;
import me.levitate.quill.injection.annotation.Module;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

@Module
@CommandAlias("market")
@CommandPermission("marketplace.view")
public class MarketCommand extends BaseCommand {

    @Inject
    private Plugin plugin;

    @Default
    private void onMarket(Player player) {
        new MarketMenu().open(player);
    }

}
