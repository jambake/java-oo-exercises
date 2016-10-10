package robots;

public class CarryRobot extends Robot
{
	private boolean isCarrying;
	
	public CarryRobot (String name, int xPos, int yPos, int speed, byte orientation)
	{
		super(name, xPos, yPos, speed, orientation);
		this.isCarrying = false;
	}
	
	public void pickup()
	{
		this.isCarrying = true;
	}
	public void putdown()
	{
		this.isCarrying = false;
	}
	
	
	public static void main (String args[])
	{
		CarryRobot c = new CarryRobot("Bill", 10, 5, 3, (byte)4);
		System.out.println(c.getName());
	}
}
