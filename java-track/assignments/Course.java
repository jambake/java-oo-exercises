//import java.util.Objects;
//import java.util.*;

public class Course
{
//    Name
//    Credits
//    Number of seats remaining
//    Roster of Students
	
	private String name;
	private int credits, remainingSeats;
	private Student[] roster;
	private double averageGPA;
	
	public Course(String name, int credits, int numSeats)
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = numSeats;
		this.roster = new Student[numSeats];
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

	public Student[] getRoster()
	{
		return roster;
	}

	public double getAverageGPA()
	{
		return averageGPA;
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
	
	public String generateRoster()
	{
		String rosterStr = "";
		for (int i = 0; i < roster.length; i++){
			if(roster[i] != null){
				rosterStr = rosterStr + roster[i].getName() + "\n";
			}
		}
		return rosterStr;
	}
	
	public double averageGPA()
	{	
		double gpaSum = 0.0;
		int numStudents = 0;
		for (int i = 0; i < roster.length; i++){
			if (roster[i] != null){
				gpaSum += roster[i].getGPA();
				numStudents++;
			}
		}
		System.out.println(gpaSum);
		System.out.println(numStudents);

		return gpaSum / numStudents;
	}
	
	public String toString()
	{
		return "Course Name: " + this.name + " " + "Credits: " + this.credits;
	}
	
	
//	@Override
//	public boolean equals(Object o){
//		// self check
//		if(this == o)
//			return true;
//		// null check
//		if(o == null)
//			return false;
//		// type-check and cast
//		if(!(o instanceof Course))
//			return false;
//		
//		Course p = (Course) o;
//		
//		return Objects.equals(name, p.name) && Objects.equals(credits, p.credits) &&
//				Objects.equals(remainingSeats,  p.remainingSeats);
//	}
}
