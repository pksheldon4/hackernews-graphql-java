package com.pksheldon4.howtographql.hackernewsgraphqljava.model;

public class Link {

    private final String url;
    private final String description;

    public Link(String url, String description) {
        this.url = url;
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }
}