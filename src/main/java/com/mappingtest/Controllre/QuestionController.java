package com.mappingtest.Controllre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mappingtest.Services.QuestionServiceImpl;
import com.mappingtest.entities.Question;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionServiceImpl questionServiceImpl;
	@PostMapping("/add")
	public Question add(@RequestBody Question Question) {
	return 	questionServiceImpl.add(Question);
		
		
	}
	@GetMapping("/all")
	public List<Question> getAll() {
		return questionServiceImpl.getAllQue();
	}
	@GetMapping("/get/{qid}")
	public Question getAll(@PathVariable int qid) {
		return questionServiceImpl.getQue(qid);
	}
	
	
}
