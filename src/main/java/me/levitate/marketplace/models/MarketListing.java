package me.levitate.marketplace.models;

import com.nivixx.ndatabase.api.annotation.Indexed;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.levitate.jackson.annotation.JsonProperty;

import java.util.UUID;

// todo ~ add the item, missing the serializer/deserializer at the moment.

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MarketListing {

    @JsonProperty("sellerId")
    private UUID sellerId;

    @JsonProperty("price")
    private double price;

    @JsonProperty("listedAt")
    private Long listedAt;

    @JsonProperty("blackMarket")
    @Indexed
    private boolean blackMarket;

}