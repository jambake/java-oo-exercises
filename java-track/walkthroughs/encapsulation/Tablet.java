package encapsulation;

public class Tablet extends Computer
{
	public Tablet(int memory, double size, double processor, String brand)
	{
		super(memory, size, processor, brand);
	}
	
	public void touch(int x, int y)
	{
		if (x > 0 && x < this.size && y > 0 && y < this.size)
		{
			System.out.println("Touched the screen.");
		}
	}
	
	
	public static void main (String args[])
	{
		Tablet t = new Tablet(8, 15, 100000, "Lenovo");
		t.touch(5,  10);
	}
}
