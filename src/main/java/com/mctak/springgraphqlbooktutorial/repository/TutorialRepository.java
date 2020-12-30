package com.mctak.springgraphqlbooktutorial.repository;

import com.mctak.springgraphqlbooktutorial.model.Tutorial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
