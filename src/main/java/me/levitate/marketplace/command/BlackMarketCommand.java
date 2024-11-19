package me.levitate.marketplace.command;

import me.levitate.acf.BaseCommand;
import me.levitate.acf.annotation.CommandAlias;
import me.levitate.acf.annotation.CommandPermission;
import me.levitate.acf.annotation.Default;
import me.levitate.marketplace.menu.BlackMarketMenu;
import me.levitate.quill.injection.annotation.Inject;
import me.levitate.quill.injection.annotation.Module;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

@Module
@CommandAlias("blackmarket")
@CommandPermission("marketplace.blackmarket")
public class BlackMarketCommand extends BaseCommand {

    @Inject
    private Plugin plugin;

    @Default
    private void onBlackMarket(Player player) {
        new BlackMarketMenu().open(player);
    }

}
