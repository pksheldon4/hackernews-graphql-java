package com.pksheldon4.howtographql.hackernewsgraphqljava.repository;

import com.pksheldon4.howtographql.hackernewsgraphqljava.schema.Link;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LinkRepository extends MongoRepository<Link, String> {

}