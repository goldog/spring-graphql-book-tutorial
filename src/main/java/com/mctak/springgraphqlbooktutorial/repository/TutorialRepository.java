package com.mctak.springgraphqlbooktutorial.repository;

import com.mctak.springgraphqlbooktutorial.model.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
