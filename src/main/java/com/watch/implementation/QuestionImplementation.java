package com.watch.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.Question;
import com.watch.repository.QuestionRepository;
import com.watch.service.QuestionService;

@Service
public class QuestionImplementation implements QuestionService {

	
	QuestionRepository questionRepository = null;
	
	@Autowired
	public QuestionImplementation(QuestionRepository questionRepository) {
		super();
		this.questionRepository = questionRepository;
	}

	@Override
	public List<Question> listQuestion() {
		return questionRepository.findAll();
	}

	@Override
	public Question addQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public void deleteQuestion(Long id) {
		questionRepository.deleteById(id);
	}

	@Override
	public Question updateQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Optional<Question> findQuestion(Long id) {
		return questionRepository.findById(id);
	}

}
