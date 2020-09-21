package com.watch.service;

import java.util.List;
import java.util.Optional;

import com.watch.entities.Question;

public interface QuestionService {

	Optional<Question> findQuestion(Long id);
	
	List<Question> listQuestion();
	
	Question addQuestion(Question question);
	
	void deleteQuestion(Long id);
	
	Question updateQuestion(Question question);
}
