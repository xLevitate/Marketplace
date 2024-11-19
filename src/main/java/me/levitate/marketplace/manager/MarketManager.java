package me.levitate.marketplace.manager;

import me.levitate.marketplace.config.MainConfig;
import me.levitate.marketplace.config.Messages;
import me.levitate.quill.config.ConfigManager;
import me.levitate.quill.injection.annotation.Inject;
import me.levitate.quill.injection.annotation.Module;
import me.levitate.quill.injection.annotation.PostConstruct;
import org.bukkit.plugin.Plugin;

@Module
public class MarketManager {

    @Inject
    private Plugin plugin;

    @Inject
    private ConfigManager configManager;

    private MainConfig config;
    private Messages messages;

    @PostConstruct
    public void onConstruct() {
        config = configManager.getConfig(MainConfig.class);
        messages = configManager.getConfig(Messages.class);
    }

}
