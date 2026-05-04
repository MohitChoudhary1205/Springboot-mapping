package com.mappingtest.Services;

import java.util.List;

import com.mappingtest.entities.Answer;

public interface AnswerService {
Answer addans(Answer answer);
Answer getbyid(int aid);
List<Answer> getAll();
}
