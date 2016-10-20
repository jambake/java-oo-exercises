package Baseball;

public class Player {
	// attributes
	// a baseball player has a name, number, salary, team
	protected String name;
	private int number;
	private int salary;
	private Team currentTeam;
	
	//a baseball player can:
	// be created - constructor
	// be traded to or signed by another team, change numbers 
	public Player(String name, int number){
		this.name = name;
		this.number = number;
		this.salary = 0;
		this.currentTeam = null;
	}
	
	public void sign(Team newTeam, int newSalary){
		updateTeam(newTeam);
		updateSalary(newSalary);
	}
	
	public void updateNumber(int newNumber){
		this.number = newNumber;
	}
	
	private void updateTeam(Team newTeam){
		this.currentTeam = newTeam;
	}
	
	private void updateSalary(int newSalary){
		this.salary = newSalary;
	}
	
	public int getSalary(){
		return this.salary;
	}
	
	public String toString(){
		return this.name + " number: " + this.number + " team: " + this.currentTeam.getName() + " salary: " + this.salary;
	}
}
