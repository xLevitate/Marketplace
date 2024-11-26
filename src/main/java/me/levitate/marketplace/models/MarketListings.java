package me.levitate.marketplace.models;


import com.nivixx.ndatabase.api.annotation.NTable;
import com.nivixx.ndatabase.api.model.NEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.levitate.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@NTable(name = "market_listings", schema = "", catalog = "")
public class MarketListings extends NEntity<UUID> {

    @JsonProperty("marketListings")
    private List<MarketListing> marketListings;

}
