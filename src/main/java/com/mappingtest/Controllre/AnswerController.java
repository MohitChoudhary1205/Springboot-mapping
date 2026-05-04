package com.mappingtest.Controllre;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mappingtest.Repository.AnswerRepository;
import com.mappingtest.Services.AnswerServiceImpl;
import com.mappingtest.entities.Answer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/answer")
public class AnswerController {

    
@Autowired
private AnswerServiceImpl answerServiceImpl;

   

@PostMapping("/add")
public Answer add(@RequestBody Answer answer) {
   
    
    return answerServiceImpl.addans(answer);
}
@GetMapping("/getall")
public List<Answer> getAll() {
    return answerServiceImpl.getAll();
}


}
