package me.levitate.marketplace.config;

import lombok.Getter;
import me.levitate.quill.config.annotation.Comment;
import me.levitate.quill.config.annotation.Configuration;

@Getter
@Configuration("messages.yml")
@SuppressWarnings("FieldMayBeFinal")
public class Messages {

    @Comment("General Messages")
    private String listedItem = "<#3AFF2F>You have listed that item for {price}.";

    @Comment("Error Messages")
    private String noHeldItem = "<#FF2F2F>You must be holding an item to sell.";

}
