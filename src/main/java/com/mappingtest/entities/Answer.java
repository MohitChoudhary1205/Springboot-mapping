package com.mappingtest.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long aid;
private String aname;
@OneToOne(mappedBy = "answer")
@JsonIgnore
private Question question;
public Answer() {
	
}
public void setAid(Long aid) {
    this.aid = aid;
}
public Question getQuestion() {
	return question;
}
public void setQuestion(Question question) {
	this.question = question;
}
public Long getAid() {
	return aid;
}

public String getAname() {
	return aname;
}
public void setAname(String aname) {
	this.aname = aname;
}
public Answer( String aname) {
	super();
	
	this.aname = aname;
}


}
