package question;

import java.util.ArrayList;

public class MultipleChoice extends Question
{
	public MultipleChoice(String question, String answer)
	{
		super(question, answer);
	}
	
	public static void main (String args[])
	{
		ArrayList<Question> questions = new ArrayList<Question>();
		Question MultCh1 = new Question("What year was the last time the Cardinals won the World Series?", "2011");
		Question MultCh2 = new Question("Which manager led the Cardinals to a World Series victory in 2006?", "Tony La Russa");
		questions.add(MultCh1);
		questions.add(MultCh2);
	}
	
}
