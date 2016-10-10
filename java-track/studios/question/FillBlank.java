package question;

import java.util.ArrayList;

public class FillBlank extends Question
{
	public FillBlank(String question, String answer)
	{
		super(question, answer);
	}
	
	public static void main (String args[])
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		Question FB1 = new Question("The first president of the United States was ", "George Washington");
		questions.add(FB1);
	}
}
