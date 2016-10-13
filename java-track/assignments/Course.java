
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
		this.roster = roster;
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
	
//	public double averageGPA(Student x)
//	{	
//		double gpaSum = 0.0;
//		gpaSum += x.getGPA();
//		averageGPA = gpaSum / this.remainingSeats;
//		return this.averageGPA;
//	}
	
	public String toString()
	{
		return "Course Name: " + this.name + " " + "Credits: " + this.credits;
	}
}
