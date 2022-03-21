package com.pythonjava4teachers.com;

public class Question {
	
	// Class represents a question in our test

	String prompt;
	String answer;
	
	
	public Question(String prompt, String answer) {
		
		//Accepting input - whatever the user passes in will become 
		// the question and the answer
		this.prompt = prompt;
		this.answer = answer;
		
	}
	
}
