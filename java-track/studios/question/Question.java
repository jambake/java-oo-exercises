package question;

import java.util.ArrayList;

public class Question
{
	private String question, answer;
	private boolean isCorrect;
//	private int score, questionNum;
//	private double grade;
	
	public Question(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
		this.isCorrect = false;
//		this.questionNum = 0;
//		this.score = 0;
//		this.grade = 0.0;
	}
	
	public String getQuestion()
	{
		return this.question;
	}
	public String getAnswer()
	{
		return this.answer;
	}
	public boolean getIsCorrect()
	{
		return this.isCorrect;
	}
//	public String getScore()
//	{
//		return this.score + "/" + this.questionNum;
//	}
//	public double getGrade()
//	{
//		grade = (double)this.score / (double)this.questionNum;
//		return this.grade;
//	}
	public static void main(String args[])
	{
		
	}
	
}
