package com.pksheldon4.howtographql.hackernewsgraphqljava.servlet;

import com.coxautodev.graphql.tools.SchemaParser;
import com.pksheldon4.howtographql.hackernewsgraphqljava.schema.Mutation;
import com.pksheldon4.howtographql.hackernewsgraphqljava.schema.Query;
import com.pksheldon4.howtographql.hackernewsgraphqljava.repository.LinkRepository;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;

@WebServlet("/graphql")
public class GraphQLEndpoint extends SimpleGraphQLServlet {

    @Autowired
    public GraphQLEndpoint(LinkRepository linkRepository) {
        super(buildSchema(linkRepository));
    }

    private static GraphQLSchema buildSchema(LinkRepository linkRepository) {
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(linkRepository), new Mutation(linkRepository))
                .build()
                .makeExecutableSchema();
    }

}
