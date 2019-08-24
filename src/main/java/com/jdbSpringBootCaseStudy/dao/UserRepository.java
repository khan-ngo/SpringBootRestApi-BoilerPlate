package com.jdbSpringBootCaseStudy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.jdbSpringBootCaseStudy.model.User;

@RepositoryRestResource(collectionResourceRel="users",path="users")
public interface UserRepository extends JpaRepository<User, Integer>{



}
