package com.pksheldon4.howtographql.hackernewsgraphqljava;

import com.pksheldon4.howtographql.hackernewsgraphqljava.repository.LinkRepository;
import com.pksheldon4.howtographql.hackernewsgraphqljava.schema.Link;
import com.pksheldon4.howtographql.hackernewsgraphqljava.servlet.GraphQLEndpoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.domain.Example;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@SpringBootApplication
@ServletComponentScan
public class HackernewsGraphqlJavaApplication {


    @Autowired
    private LinkRepository linkRepository;

    public static void main(String[] args) {
        SpringApplication.run(HackernewsGraphqlJavaApplication.class, args);
    }

}
