package Baseball;

public class PowerHittingStrategy implements HittingStrategy{

	@Override
	public int simulateAtBat() {
		double r = Math.random();
		int outcome = 1;
		if (r <= 0.250){
			outcome++;
			if(r <= 0.125){
				outcome++;
			}
		}
		return outcome;
	}
}
