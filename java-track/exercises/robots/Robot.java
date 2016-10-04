package robots;

public class Robot
{
	//Fields:
	
	private String name;
	private int xPos;
	private int yPos;
	private int speed;
	private byte orientation;
	
	//Constructor
	public Robot(String name, int xPos, int yPos, int speed, byte orientation)
	{
		this.name = name;
		this.xPos = xPos;
		this.yPos = yPos;
		this.speed = speed;
		this.orientation = orientation;
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
	public int getOrientation()
	{
		return this.orientation;
	}
	public String getPosition(int x, int y)
	{
		return this.xPos + ", " + this.yPos + " ";
	}
	
	//Adders
	//Setters
	public void setSpeed(int newSpeed)
	{
		this.speed = newSpeed;
	}
	
	public void move()
	{
		if (this.orientation == 0)
		{
			this.yPos += this.speed;
		}
		else if (this.orientation == 2)
		{
			this.yPos -= this.speed;
		}
		else if (this.orientation == 1)
		{
			this.xPos += this.speed;
		}
		else
		{
			this.xPos -= this.speed;
		}
	}
	
	public void rotate(boolean clockwise)
	{
		if(clockwise)
		{
			this.orientation += 1;
			this.orientation %= 4;
		}
		else
		{
			if (this.orientation == 0)
			{
				this.orientation = 3;
			}
			else 
			{
				this.orientation -= 1;
			}
		}
	}
	
	public void distance()
	{
		// TODO
	}
	
	//Display info
	public String toString()
	{
		return "Name: " + this.name + " Position: " + getPosition(this.xPos, this.yPos) + "Speed: " + this.speed + " Orientation: " + this.orientation;
	}
	

	public static void main(String[] args)
	{
		Robot newRobot = new Robot("Steve", 1, 1, 10, (byte)1);
		System.out.println(newRobot);
		//newRobot.setOrientation(-90);
		System.out.println(newRobot);
	}

}
