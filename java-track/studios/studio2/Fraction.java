package studio2;

public class Fraction
{
	private int num, denom;

	public Fraction(int num, int denom)
	{
		this.num = num;
		this.denom = denom;
	}

	public Fraction addFrac(Fraction x)
	{
		int newDenom = this.denom * x.denom;
		int newNum = (this.num * x.denom) + (this.denom * x.num);
		Fraction sumFrac = new Fraction(newNum, newDenom);
		//System.out.println(sumFrac.num + " / " + sumFrac.denom);
		//return this.num + " / " + this.denom + " + " + x.num + " / " + x.denom + " = " + sumFrac.num + " / " + sumFrac.denom;
		return sumFrac;
	}

	public Fraction multFrac(Fraction x)
	{
		int newNum = this.num * x.num;
		int newDenom = this.denom * x.denom;
		Fraction prodFrac = new Fraction(newNum, newDenom);
		//return this.num + " / " + this.denom + " * " + x.num + " / " + x.denom + " = " + prodFrac.num + " / " + prodFrac.denom;
		return prodFrac;
	}
	
	public Fraction recipFrac()
	{
		int newNum = this.denom;
		int newDenom = this.num;
		Fraction recipFrac = new Fraction(newNum, newDenom);
		//return this.num + " / " + this.denom + " = " + this.denom + " / " + this.num;
		return recipFrac;
	}
	
	public String simpFrac()
	{
		return "TODO";
	}
	
	public static void main(String[] args)
	{
		Fraction f1 = new Fraction(2, 4);
		Fraction f2 = new Fraction(3, 6);
		
	}
}
