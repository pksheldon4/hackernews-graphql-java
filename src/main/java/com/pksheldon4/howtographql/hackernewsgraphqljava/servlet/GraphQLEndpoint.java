package com.pksheldon4.howtographql.hackernewsgraphqljava.servlet;

import com.coxautodev.graphql.tools.SchemaParser;
import com.pksheldon4.howtographql.hackernewsgraphqljava.model.Query;
import com.pksheldon4.howtographql.hackernewsgraphqljava.repository.LinkRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import javax.servlet.annotation.WebServlet;

@WebServlet("/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    public GraphQLEndpoint() {
        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {
        LinkRepository linkRepository = new LinkRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(linkRepository))
                .build()
                .makeExecutableSchema();
    }

}
