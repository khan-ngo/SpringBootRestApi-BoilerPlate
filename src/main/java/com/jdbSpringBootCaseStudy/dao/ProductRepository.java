package com.jdbSpringBootCaseStudy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jdbSpringBootCaseStudy.model.Product;

@RepositoryRestResource(collectionResourceRel="products",path="products")
public interface ProductRepository extends JpaRepository<Product, Integer>{



}
