package com.pksheldon4.howtographql.hackernewsgraphqljava.schema;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Link {

    private String id;
    private String url;
    private String description;

    public Link(String url, String description) {
        this(null, url, description);
    }

}