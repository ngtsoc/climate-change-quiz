package com.pythonjava4teachers.com;

import java.util.Scanner;

public class App {

	public static void main(String [] args) {
		
		String q1 = "Which of the following is the biggest cause of global warming?\n" +
					"(a)Decomposing Plants\n(b)Burning fossil fuels\n(c)Natural variation of the plant\n(d)Pollution from wildfires\n";
		
		String q2 = "Which of the following places has warmed the most, over the past 100 years?\n" +
					"(a)Marrakech, Morocco\n(b)Basra, Iraq\n(c)Vancouver, Canada\n(d)Svalbard, Norway\n";
		
		//Create an array of questions
		//Question passed in as the first parameter,
		// correct answer passed in as second
		Question [] questions = {
				
				new Question(q1, "b"),
				new Question(q2, "d")
				
		};
		
		takeTest(questions);
			
	}
	
	//Method will take an array of questions
	//
	public static void takeTest(Question[] questions) {
		
		System.out.println("---------- Music Quiz ----------");
		
		//Ask the user each individual question
		//If they get it right, increment score
		
		int score = 0;
		Scanner keyboardInput = new Scanner(System.in);
		
		//Loop through each question using a FOR loop
		
		for(int i = 0; i < questions.length; i++) { 
			
			//Get input from user by using scanner
			System.out.println(questions[i].prompt);
			String answer = keyboardInput.nextLine();
			if (answer.equals(questions[i].answer)) {
				score++;
			}
			
		}
		
		System.out.println("---------------------------------");
		System.out.println("You got " + score + " out of " + questions.length);
		
	}
	
	
}
