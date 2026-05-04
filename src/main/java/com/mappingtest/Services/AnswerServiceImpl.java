package com.mappingtest.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mappingtest.Repository.AnswerRepository;
import com.mappingtest.entities.Answer;

@Service
public class AnswerServiceImpl implements AnswerService {
@Autowired 
private AnswerRepository answerRepository;
	@Override
	public Answer addans(Answer answer) {
		
		return answerRepository.save(answer);
	}

	@Override
	public Answer getbyid(int aid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Answer> getAll() {
		return answerRepository.findAll();
	}

}
