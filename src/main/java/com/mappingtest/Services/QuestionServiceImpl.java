package com.mappingtest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mappingtest.Controllre.QuestionController;
import com.mappingtest.Repository.QuestionRepository;
import com.mappingtest.entities.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

   
@Autowired
private QuestionRepository questionRepository;

    
	@Override
	public Question add(Question question) {

  return questionRepository.save(question);
		
	}

	@Override
	public Question getQue(int qid) {
		return questionRepository.getById(qid);
	}
	@Override
	public List<Question> getAllQue() {
	return	questionRepository.findAll();
		
  
		
		
	}

	@Override
	public void deleteQue() {
		// TODO Auto-generated method stub
		
	}

}
