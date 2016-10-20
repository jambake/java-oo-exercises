package Baseball;

public class Pitcher extends Player{
	
	private int strikeOuts;
	private int homeRunsAgainst;

	public Pitcher(String name, int number){
		super(name,number);
		this.strikeOuts = 0;
		this.homeRunsAgainst = 0;

	}
	
	public void updateStats(int k, int hra){
		this.strikeOuts += k;
		this.homeRunsAgainst += hra;
	}
	
	public void simulateAtBat(){
		double r = Math.random();
		if (r < 0.15){
			this.strikeOuts++;
		}
		if(r > 0.97){
			this.homeRunsAgainst++;
		}
	}
	
	public String toString(){
		return "Pitcher " + super.toString() + "   strikeouts: " + strikeOuts + "    home runs allowed: " + this.homeRunsAgainst;
 	}
}
