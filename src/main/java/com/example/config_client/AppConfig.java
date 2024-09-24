package com.example.config_client;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
@Data
@RefreshScope
public class AppConfig {

    private String name;
    private String version;
    private Features features;

    @Data
    public static class Features {
        private boolean enableFeatureX;
        private boolean enableFeatureY;

        // Getters and Setters
    }

    // Getters and Setters
}
