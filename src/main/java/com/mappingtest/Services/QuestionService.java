package com.mappingtest.Services;

import java.util.List;

import com.mappingtest.entities.Question;

public interface QuestionService {
Question add(Question question);
Question getQue(int id);
List<Question> getAllQue();
void deleteQue();
}
