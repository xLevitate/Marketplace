package me.levitate.marketplace.manager;

import com.nivixx.ndatabase.api.NDatabase;
import com.nivixx.ndatabase.api.repository.Repository;
import me.levitate.marketplace.config.Messages;
import me.levitate.marketplace.models.MarketListing;
import me.levitate.marketplace.models.MarketListings;
import me.levitate.quill.config.ConfigManager;
import me.levitate.quill.injection.annotation.Inject;
import me.levitate.quill.injection.annotation.Module;
import me.levitate.quill.injection.annotation.PostConstruct;
import org.bukkit.plugin.Plugin;

import java.util.List;
import java.util.UUID;
import java.util.logging.Level;

@Module
public class MarketManager {
    Repository<UUID, MarketListings> repository;

    @Inject
    private Plugin plugin;

    @Inject
    private ConfigManager configManager;

    private Messages messages;

    @PostConstruct
    public void init() {
        // Load configs
        messages = configManager.getConfig(Messages.class);

        // Load the database repository
        repository = NDatabase.api().getOrCreateRepository(MarketListings.class);

        // Insert sample to test
        repository.insert(new MarketListings(List.of(new MarketListing(UUID.randomUUID(), 100d, System.currentTimeMillis(), false))));
    }
}