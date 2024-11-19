package me.levitate.marketplace.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketListing {
    private UUID sellerId;
    private ItemStack item;
    private double price;
    private Long listedAt;
    private boolean blackMarket;
}