import java.util.Objects;

public class Student
{
	// Name (first and last)
	// Student ID
	// Credits
	// GPA
	
	protected String firstName, lastName, classStanding;
	private int StudentID, credits;
	private double GPA, qualityScore;
	
	public Student(String firstName, String lastName, int StudentID)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.StudentID = StudentID;
		this.classStanding = null;
		this.credits = 0;
		this.GPA = 0.0;
		this.qualityScore = 0.0;
	}
	
	// getters
	public String getName()
	{
		return this.firstName + " " + this.lastName;	
	}
	public int getStudentID()
	{
		return this.StudentID;
	}
	public int getCredits()
	{
		return this.credits;
	}
	public double getGPA()
	{
		return this.GPA;
	}
	
	// setters
//	public void setCredits(int newCredits)
//	{
//		this.credits = newCredits;
//	}
//	public void setGPA(double newGPA)
//	{
//		this.GPA = newGPA;
//	}
	
	public String getClassStanding()
	{
		if (this.credits < 30)
		{
			classStanding = "Freshman";
		}
		else if (this.credits < 60)
		{
			classStanding = "Sophomore";
		}
		else if (this.credits < 90)
		{
			classStanding = "Junior";
		}
		else
		{
			classStanding = "Senior";
		}
		return classStanding;
	}
	
	public void submitGrade(double grade, int credits)
	{
		this.qualityScore += grade * credits;
		this.credits += credits;
		this.GPA = this.qualityScore / this.credits;   
		this.GPA = (double)Math.round(this.GPA*1000) / 1000;
	}
	
	public double computeTuition()
	{
		double tuitionTotal = 0.0;
		double tuition = 20000.0;
		int semester = (int)credits / 15;
		int leftOverCred = credits % 15;
		tuitionTotal = (semester * tuition) + (leftOverCred * 1333.33);
	
		return tuitionTotal;
	}

	public Student createLegacy(Student x)
	{
		Student createBaby = new Student(x.getName(), this.getName(), x.getStudentID() + this.getStudentID());
		createBaby.GPA = (x.getGPA() + this.getGPA()) / 2;
		if (x.getCredits() > this.getCredits())
		{
			createBaby.credits = x.getCredits();
		}
		else
			createBaby.credits = this.getCredits();
		
		return createBaby;
	}
	
	public String toString()
	{
		return "Student Name: " + this.firstName + " " + this.lastName + " | " + "Student ID#: " + this.StudentID;
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
		if(!(o instanceof Student))
			return false;
		
		Student p = (Student) o;
		
		return Objects.equals(firstName, p.firstName) && Objects.equals(lastName, p.lastName) &&
				Objects.equals(StudentID,  p.StudentID);
	}
}

