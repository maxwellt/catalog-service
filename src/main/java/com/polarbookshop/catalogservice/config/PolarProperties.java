package com.polarbookshop.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Originally used a java Record for this, but it doesn't play nice with live reloading of properties
 * presumably due to the immutability of a record, but not sure
 */
@ConfigurationProperties(prefix = "polar")
public class PolarProperties {

    /**
     * the greeting to show when navigating to /
     */
    private String greeting;

    /**
     * testdata properties relating to the testdata
     */
    private PolarTestDataProperties testdata;

    public PolarProperties() {} // empty constructor necessary for live reloading

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public PolarTestDataProperties getTestdata() {
        return testdata;
    }

    public void setTestdata(PolarTestDataProperties testdata) {
        this.testdata = testdata;
    }
}
