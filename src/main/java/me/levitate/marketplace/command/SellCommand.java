package me.levitate.marketplace.command;

import me.levitate.acf.BaseCommand;
import me.levitate.acf.annotation.CommandAlias;
import me.levitate.acf.annotation.CommandPermission;
import me.levitate.acf.annotation.Default;
import me.levitate.acf.annotation.Syntax;
import me.levitate.quill.injection.annotation.Module;
import org.bukkit.entity.Player;

@Module
@CommandAlias("sell")
@CommandPermission("marketplace.sell")
public class SellCommand extends BaseCommand {

    @Default
    @Syntax("<price>")
    private void onSell(Player player, long price) {

    }

}
