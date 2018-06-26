package com.pksheldon4.howtographql.hackernewsgraphqljava.schema;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.pksheldon4.howtographql.hackernewsgraphqljava.repository.LinkRepository;

import java.util.List;

public class Query implements GraphQLQueryResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.findAll();
}
}
