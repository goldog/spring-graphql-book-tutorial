package com.mctak.springgraphqlbooktutorial.resolver;

import java.util.Optional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.mctak.springgraphqlbooktutorial.model.Author;
import com.mctak.springgraphqlbooktutorial.model.Tutorial;
import com.mctak.springgraphqlbooktutorial.repository.AuthorRepository;
import com.mctak.springgraphqlbooktutorial.repository.TutorialRepository;

import org.springframework.beans.factory.annotation.Autowired;

import javassist.NotFoundException;

public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private TutorialRepository tutorialRepository;

    public Author createAuthor(String name, Integer age) {
        Author author = new Author();
        author.setName(name);
        author.setAge(age);

        authorRepository.save(author);

        return author;
    }

    public Tutorial createTutorial(String title, String description, Long authorId) {
        Tutorial tutorial = new Tutorial();
        tutorial.setAuthor(new Author(authorId));
        tutorial.setTitle(title);
        tutorial.setDescription(description);

        tutorialRepository.save(tutorial);

        return tutorial;
    }

    public boolean deleteTutorial(Long id) {
        tutorialRepository.deleteById(id);
        return true;
    }

    public Tutorial updateTutorial(Long id, String title, String description) throws NotFoundException {
        Optional<Tutorial> optTutorial = tutorialRepository.findById(id);

        if (optTutorial.isPresent()) {
            Tutorial tutorial = optTutorial.get();

            if (title != null)
                tutorial.setTitle(title);
            if (description != null)
                tutorial.setDescription(description);

            tutorialRepository.save(tutorial);
            return tutorial;
        }

        throw new NotFoundException("Not found Tutorial to update!");
    }
}