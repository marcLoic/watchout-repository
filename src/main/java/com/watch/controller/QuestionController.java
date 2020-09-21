package com.watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watch.entities.Question;
import com.watch.service.QuestionService;

@RestController
public class QuestionController {

	QuestionService questionService;

	@Autowired
	public QuestionController(QuestionService questionService) {
		super();
		this.questionService = questionService;
	}
	
	@GetMapping("/listquestion")
	public List<Question> listQuestion(){
		return questionService.listQuestion();
	}
	
	@PostMapping("/addquestion")
	public Question addQuestion(@RequestBody Question question){
		
		return questionService.addQuestion(question);
	}
	
	@DeleteMapping("/deletequestion")
	public void deleteQuestion(@PathVariable Long id){
		questionService.deleteQuestion(id);;
	}
	
	@PutMapping("/updatequestion")
	public Question updateQuestion(@RequestBody Question question){
		return questionService.updateQuestion(question);
	}
}
