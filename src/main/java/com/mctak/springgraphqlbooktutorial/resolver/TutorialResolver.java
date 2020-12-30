package com.mctak.springgraphqlbooktutorial.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.mctak.springgraphqlbooktutorial.model.Author;
import com.mctak.springgraphqlbooktutorial.model.Tutorial;
import com.mctak.springgraphqlbooktutorial.repository.AuthorRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class TutorialResolver implements GraphQLResolver<Tutorial> {
    @Autowired
    private AuthorRepository authorRepository;

    public Author getAuthor(Tutorial tutorial) {
        return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
    }

}
