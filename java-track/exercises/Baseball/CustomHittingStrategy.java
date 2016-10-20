package Baseball;

public class CustomHittingStrategy implements HittingStrategy {
	
	double average;
	double homeRunRate;
	
	public CustomHittingStrategy(double average, double hrr){
		if(average < 0 || average > 1 || hrr < 0 || hrr > 1){
			throw new IllegalArgumentException();
		}
		this.average = average;
		this.homeRunRate = hrr;
	}
	
	@Override
	public int simulateAtBat() {
		double r = Math.random();
		int outcome = 1;
		if (r <= this.average){
			outcome++;
			if(r <= this.homeRunRate){
				outcome++;
			}
		}
		return outcome;
	}

}
