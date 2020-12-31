package com.mctak.springgraphqlbooktutorial.repository;

import com.mctak.springgraphqlbooktutorial.model.Author;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
