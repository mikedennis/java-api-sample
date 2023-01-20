package com.example.hibernatedemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.hibernatedemo.models.Beer;

@RepositoryRestResource(path="beers")
public interface BeerRepository extends CrudRepository<Beer, Long>{}