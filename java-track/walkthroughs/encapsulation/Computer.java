package encapsulation;

public class Computer
{
	//Fields: has-a 'attributes' (DATA TYPES)
	
	private int memory;
	protected double size;
	private double processor;
	private String brand;
	
	//Behaviors: 'verbs' - actions that take place (METHODS)
	
	//Create a computer - 'constructor'
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	
	//Getters
	public String getBrand()
	{
		return this.brand;
	}
	
	public double getSize()
	{
		return this.size;
	}
	
	public double getProcessor()
	{
		return this.processor;
	}
	
	public int getMemory()
	{
		return this.memory;
	}
	
	//Adder
	public void addMemory(int newMemory)
	{
		if (this.memory + newMemory > 16)
		{
			return;
		}
		else
		{
			this.memory = this.memory + newMemory;
		}
	}
	
	//Setter
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	//Display info - toString()
	public String toString()
	{
		return "Memory: " + this.memory + " Processor: " + this.processor + " Size: " + this.size + " Brand: " + this.brand;
	}
	
	public static void main(String[] args)
	{
		Computer myComputer = new Computer(8, 13.3, 2.3, "Apple");
		System.out.println(myComputer.getBrand());
		Computer yourComputer = new Computer(4, 15.5, 3.3, "Lenovo");
		System.out.println(yourComputer.getBrand());
		myComputer.addMemory(4);
		System.out.println(myComputer.getMemory());
		yourComputer.addMemory(3);
		System.out.println(yourComputer.getMemory());
		System.out.println(myComputer);
	}
}
