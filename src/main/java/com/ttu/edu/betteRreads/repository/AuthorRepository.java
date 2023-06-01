package com.ttu.edu.betterReads.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ttu.edu.betterReads.entity.Author;
public interface AuthorRepository extends CassandraRepository<Author,String> {

}
