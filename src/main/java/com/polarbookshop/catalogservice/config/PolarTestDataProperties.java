package com.polarbookshop.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "polar.testdata")
public class PolarTestDataProperties {

    /**
     * load the testdata at startup
     */
    private boolean enabled = false;

    public PolarTestDataProperties() {} // empty constructor necessary for live reloading

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
