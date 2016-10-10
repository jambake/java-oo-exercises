package question;

import java.util.ArrayList;
import java.util.Random;

public class Quiz
{
	private ArrayList<Question> questions;
	private Random randomGenerator;

	public Quiz (String question)
	{
		this.questions = questions;
	}
	public Question anyQuestion()
	{
		int index = randomGenerator.nextInt(questions.size());
		return questions.get(index);
	}
}
