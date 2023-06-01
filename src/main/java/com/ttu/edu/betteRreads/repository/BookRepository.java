package com.ttu.edu.betterReads.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.ttu.edu.betterReads.entity.Books;

public interface BookRepository extends CassandraRepository<Books,String> {
}
