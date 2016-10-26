import java.util.Objects;
//import java.util.*;

public class Course
{
//    Name
//    Credits
//    Number of seats remaining
//    Roster of Students
	
	private String name;
	private int credits, remainingSeats;
	private String[] roster;
	private double averageGPA;
	
	public Course(String name, int credits, int remainingSeats)
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		//this.roster = roster;
		this.averageGPA = 0.0;
	}

	public String getName()
	{
		return name;
	}

	public int getCredits()
	{
		return credits;
	}

	public int getRemainingSeats()
	{
		return remainingSeats;
	}

	public String[] getRoster()
	{
		return roster;
	}

	public double getAverageGPA()
	{
		return averageGPA;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setCredits(int credits)
	{
		this.credits = credits;
	}

	public void setRemainingSeats(int remainingSeats)
	{
		this.remainingSeats = remainingSeats;
	}

	public boolean addStudent(Student x)
	{
		if (x.firstName + " " + x.lastName == this.getName())
		{
			return false;
		}
		else if (this.remainingSeats == 0)
		{
			return false;
		}
		else
		{
			this.remainingSeats = remainingSeats - 1;
			return true;
		}
	}
	
	public String[] generateRoster()
	{
		while (this.remainingSeats != 0)
		{
			for (int i = 0; i < this.remainingSeats; i++)
			this.roster = new String[i];
		}
		return roster;
	}
	
	public double averageGPA()
	{	
		double gpaSum = 0.0;
		
		averageGPA = gpaSum / this.remainingSeats;
		return this.averageGPA;
	}
	
	public String toString()
	{
		return "Course Name: " + this.name + " " + "Credits: " + this.credits;
	}
	
	
	@Override
	public boolean equals(Object o){
		// self check
		if(this == o)
			return true;
		// null check
		if(o == null)
			return false;
		// type-check and cast
		if(!(o instanceof Course))
			return false;
		
		Course p = (Course) o;
		
		return Objects.equals(name, p.name) && Objects.equals(credits, p.credits) &&
				Objects.equals(remainingSeats,  p.remainingSeats);
	}
}
