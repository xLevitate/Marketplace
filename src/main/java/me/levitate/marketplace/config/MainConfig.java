package me.levitate.marketplace.config;

import lombok.Getter;
import me.levitate.quill.config.annotation.Comment;
import me.levitate.quill.config.annotation.Configuration;
import me.levitate.quill.config.annotation.Path;

@Getter
@Configuration()
@SuppressWarnings("FieldMayBeFinal")
public class MainConfig {

    @Comment({
            "Configure the database settings below.",
            "Available options: mongodb, json"
    })
    @Path("database.type")
    private String storageType = "json";

    @Comment("MongoDB Connection URI")
    @Path("storage.mongodb.uri")
    private String mongoUri = "mongodb://localhost:27017/database";

}
