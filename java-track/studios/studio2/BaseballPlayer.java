package studio2;

public class BaseballPlayer
{
	// Attributes
	private String name, hand;
	private int number, games, hits, RBIs, runs;
	
	public BaseballPlayer (String name, String hand, int number)
	{
		this.name = name;
		this.hand = hand;
		this.number = number;
		this.games = 0;
		this.hits = 0;
		this.RBIs = 0;
		this.runs = 0;
	}
	
	public void playGame(int hit, int RBI, int run)
	{
		this.games = this.games +1;
		this.hits = this.hits + hit;
		this.RBIs = this.RBIs + RBI;
		this.runs = this.runs + run;
	}

	public int getRuns()
	{
		return this.runs;
	}
	public int getGames()
	{
		return this.games;
	}
	public String getName()
	{
		return this.name;
	}
	
	public static void main(String[] args) 
	{
		BaseballPlayer Chris = new BaseballPlayer("Carpenter", "Left", 13);
		System.out.println(Chris.getName());
	}
}
