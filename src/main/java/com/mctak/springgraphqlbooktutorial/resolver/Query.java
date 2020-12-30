package com.mctak.springgraphqlbooktutorial.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mctak.springgraphqlbooktutorial.model.Author;
import com.mctak.springgraphqlbooktutorial.model.Tutorial;
import com.mctak.springgraphqlbooktutorial.repository.AuthorRepository;
import com.mctak.springgraphqlbooktutorial.repository.TutorialRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class Query implements GraphQLQueryResolver {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private TutorialRepository tutorialRepository;

    public Iterable<Author> findAllAuthors() {
        return authorRepository.findAll();
    }

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialRepository.findAll();
    }

    public long countAuthors() {
        return authorRepository.count();
    }

    public long countTutorials() {
        return tutorialRepository.count();
    }

}
