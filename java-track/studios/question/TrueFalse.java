package question;

import java.util.ArrayList;

public class TrueFalse extends Question
{
	public TrueFalse(String question, String answer)
	{
		super(question, answer);
	}
	
	public static void main(String args[])
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		Question TF1 = new Question("You are 10 feet tall.", "True");
		Question TF2 = new Question("It is always 70 degrees in San Diego, CA.", "False");
		questions.add(TF1);
		questions.add(TF2);
	}
	
	
}
