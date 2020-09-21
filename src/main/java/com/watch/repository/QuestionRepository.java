package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, Long> {

}
