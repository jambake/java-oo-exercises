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
	
	public Course(String name, int credits, int remainingSeats)
	{
		this.name = name;
		this.credits = credits;
		this.remainingSeats = remainingSeats;
		this.roster = new Student[remainingSeats];
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
		if(this.remainingSeats < 1)
		{
			return false;
		}
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] != null && roster[i].getName() == x.getName()){
				return false;
			}
		}
		roster[roster.length - getRemainingSeats()] = x;
		remainingSeats--;
		return true;
	}
//		if (x.firstName + " " + x.lastName == this.getName())
//		{
//			return false;
//		}
//		else if (this.remainingSeats == 0)
//		{
//			return false;
//		}
//		else
//		{
//			this.remainingSeats = remainingSeats - 1;
//			return true;
//		}
//	}
	
	
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
		double averageGPA = 0.0;
		int numStudents = 0;
		double gpa = 0.0;
		for (int i = 0; i < roster.length; i++){
			if (roster[i] != null){
				gpa = roster[i].getGPA();
				gpaSum += gpa;
				numStudents++;
			}
		}
		
		System.out.println("gpa: " + gpa + " | gpaSum: " + gpaSum + " | numStudents: " + numStudents);
		averageGPA = gpaSum / numStudents;
		return averageGPA;
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
