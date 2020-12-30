package com.mctak.springgraphqlbooktutorial.repository;

import com.mctak.springgraphqlbooktutorial.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
