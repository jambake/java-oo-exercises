package PrepWork2;

public class Robot
{
	//Fields:
	
	private String name;
	private int xPos;
	private int yPos;
	private int speed;
	private int direction;
	
	//Constructor
	public Robot(String name, int xPos, int yPos, int speed, int direction)
	{
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		this.speed = speed;
		this.direction = direction;
	}
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	public int getXpos()
	{
		return this.xPos;
	}
	public int getYpos()
	{
		return this.yPos;
	}
	public int getSpeed()
	{
		return this.speed;
	}
	public int getDirection()
	{
		return this.direction;
	}
	public String getPosition(int x, int y)
	{
		return this.xPos + ", " + this.yPos + " ";
	}
	
	//Adders
	//Setters
	public void setOrientation(int newOrientation)
	{
		this.direction = this.direction + newOrientation;
	}
	
	//Display info
	public String toString()
	{
		return "Name: " + this.name + " Position: " + getPosition(this.xPos, this.yPos) + "Speed: " + this.speed + " Orientation: " + this.direction;
	}
	

	public static void main(String[] args)
	{
		Robot newRobot = new Robot("Steve", 1, 1, 10, 90);
		System.out.println(newRobot);
		newRobot.setOrientation(-90);
		System.out.println(newRobot);
	}

}
