package robots;

import java.util.ArrayList;
import java.util.Scanner;

public class RobotMenu
{
	private ArrayList<Robot> robots;
	private Scanner s;
	
	public static void main(String Args[])
	{
		int input = 0;
		RobotMenu m = new RobotMenu();
		do
		{
			input = m.Menu();
			m.process(input);
		} while (input != 5);
	}

	public RobotMenu()
	{
		this.s = new Scanner(System.in);
		this.robots = new ArrayList<Robot>();
	}
	
	public int Menu()
	{
		System.out.println("Welcome to the Robot Menu!");
		System.out.println("1: Create a Robot");
		System.out.println("2: Display the list of available Robots");
		System.out.println("3: Move a Robot");
		System.out.println("4: Rotate a Robot");
		System.out.println("5: Compute the distance between two Robots");
		System.out.println("6: Exit");
		System.out.println("Please select an option:");
		int selection = s.nextInt();
		while (selection < 0 || selection > 6)
		{
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return selection;
	}
	
	public void process(int selection)
	{
		if (selection == 1)
		{
			createRobot();
		}
		else if (selection == 2)
		{
			displayRobots();
		}
		else if (selection == 3)
		{
			displayRobots();
			Robot c = selectRobot();
			c.move();
			System.out.println("Here is the Robot's status after it moved: ");
			System.out.println(c);
		}
		else if (selection == 4)
		{
			displayRobots();
			Robot c = selectRobot();
			System.out.println("Would you like the Robot to rotate clockwise? Y or N");
			String ans  = s.next();
			if (ans == "Y")
			{
				c.rotate(true);
			}
			else
			{
				c.rotate(false);
			}
			System.out.println("Here is the Robot's status after it rotated: ");
			System.out.println(c);
		}
		else if (selection == 5)
		{
			System.out.println("Under Construction");
		}
	}
	
	public void displayRobots()
	{
		for (int i = 0; i < robots.size(); i++)
		{
			System.out.println((i+1) + ".)" + robots.get(i));
		}
	}
	
	private Robot selectRobot()
	{
		System.out.println("Please select a Robot: ");
		int selection = s.nextInt();
		while (selection < 1 || selection > robots.size())
		{
			System.out.println("Invalid selection, please try again: ");
			selection = s.nextInt();
		}
		return robots.get(selection-1);
	}
	
	private void createRobot()
	{
		System.out.println("Please enter the Robot's name: ");
		String name = s.next();
		System.out.println("Please enter the Robot's x position: ");
		int xPos = s.nextInt();
		while (xPos < 1)
		{
			System.out.println("Invalid value, please enter a positive value: ");
			xPos = s.nextInt();
		}
		System.out.println("Please enter the Robot's y position: ");
		int yPos = s.nextInt();
		while (yPos < 1)
		{
			System.out.println("Invalid value, please enter a positive value: ");
			yPos = s.nextInt();
		}
		System.out.println("Please enter the Robot's speed: ");
		int speed = s.nextInt();
		while (speed < 1)
		{
			System.out.println("Invalid value, please enter a positive value: ");
			speed = s.nextInt();
		}
		System.out.println("Please enter an orientation for the robot (north = 0, east = 1, south = 2, west = 3):");
		byte orientation = (byte) s.nextInt();
		while (orientation < 0 || orientation > 3)
		{
			System.out.println("Invalid value, please enter a correct value: ");
			orientation = (byte) s.nextInt();
		}
		robots.add(new Robot(name, xPos, yPos, speed, orientation));
	}
}
