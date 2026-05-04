package com.mappingtest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mappingtest.entities.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Integer>{

}
