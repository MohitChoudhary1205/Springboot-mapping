package com.mappingtest.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int qid;

private String qname;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name =  "aid")
private Answer answer;
public int getQid() {
	return qid;
}



public String getQname() {
	return qname;
}

public void setQname(String qname) {
	this.qname = qname;
}

public Question( String qname, Answer answer
		) {
	super();
	
	this.qname = qname;
	this.answer= answer;
	
}

public Answer getAnswer() {
	return answer;
}



public void setAnswer(Answer answer) {
	this.answer = answer;
}



public Question() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "id =" +qid+" qname= "+qname ;
	}

}
