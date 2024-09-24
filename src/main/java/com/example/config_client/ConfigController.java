package com.example.config_client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    @Autowired
    private AppConfig appConfig;

    @GetMapping("/config")
    public String getConfig() {
        return "App Name: " + appConfig.getName() + 
               ", Version: " + appConfig.getVersion() + 
               ", FeatureX Enabled: " + appConfig.getFeatures().isEnableFeatureX() +
                ", FeatureY Enabled: " + appConfig.getFeatures().isEnableFeatureY();
    }
}
