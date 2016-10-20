package Baseball;

public class FieldPlayer extends Player{

	private int atBats;
	private int hits;
	private int homeRuns;
	private HittingStrategy strategy;
	
	public FieldPlayer(String name, int number, HittingStrategy hs){
		super(name,number);
		this.atBats = 0;
		this.hits = 0;
		this.homeRuns = 0;
		this.strategy = hs;
	}

	public double calculateAverage(){
		double avg = (double) this.hits / (double) this.atBats;
		avg = Math.round(avg * 1000) / 1000.0;
		return avg;
	}
	
	public void updateStats(int hits, int atBats, int hrs){
		this.hits += hits;
		this.atBats += atBats;
		this.homeRuns += hrs;
	}
	
	public void simulateAtBat(){
		int outcome  = this.strategy.simulateAtBat();
		if(outcome > 2){
			this.homeRuns++;
		}
		if(outcome > 1){
			this.hits++;
		}
		this.atBats++;
	}
	
	public String toString(){
		return super.toString() + "   batting average: " + calculateAverage() + "   home runs: " + this.homeRuns;
	}
	
	public static void main(String[] args){
		FieldPlayer fp = new FieldPlayer("Matt Holliday", 7, new PowerHittingStrategy());
		FieldPlayer fp1;
		try {
			fp1 = new FieldPlayer("Yadier Molina", 4, new CustomHittingStrategy(0.300,.100));
		}
		catch (IllegalArgumentException e){
			System.out.println("bad arguments to constructor");
			e.printStackTrace();
			return;
		}
		catch (Exception e){
			System.out.println("unexpected exception");
			e.printStackTrace();
			return;
		}
		Team cards = new Team("Cardinals");
		for(int i = 0; i < 400; i++){
			fp.simulateAtBat();
			fp1.simulateAtBat();
		}
		cards.addPlayer(fp, 1000000);
		cards.addPlayer(fp1, 1000000);
		System.out.println(fp);
		System.out.println(fp1);
	}
}
