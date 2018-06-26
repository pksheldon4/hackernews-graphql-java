package com.pksheldon4.howtographql.hackernewsgraphqljava.schema;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.pksheldon4.howtographql.hackernewsgraphqljava.repository.LinkRepository;

public class Mutation implements GraphQLMutationResolver {

    private final LinkRepository linkRepository;

    public Mutation(LinkRepository repository) {
        this.linkRepository = repository;
    }

    public Link createLink(String url, String description) {
        Link newLink = new Link(url, description);
        linkRepository.save(newLink);
        return  newLink;
    }
}
