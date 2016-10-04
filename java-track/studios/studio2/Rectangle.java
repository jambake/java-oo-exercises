package studio2;

public class Rectangle
{
	private int length, width;

	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	public int getArea()
	{
		return this.length*this.width;
	}

	public int getPerimeter()
	{
		return (this.length*2) + (this.width*2);
	}


	public boolean isSmaller(Rectangle n)
	{
		if(n.getArea() > this.getArea())
		{
			System.out.println("I am smaller!");
			return true;
		} else
		{
			System.out.println("I am larger!");
			return false;
		}
	}

	public boolean isSquare()
	{
		if (this.length == this.width)
		{
			System.out.println("I am a square!");
			return true;
		} 
		else
		{
			System.out.println("I am a rectangle!");
			return false;
		}
	}

	public String toString()
	{
		return "Length: " + this.length + " Width: " + this.width + " Area: " + getArea() + " Perimeter: " + getPerimeter();
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(3, 5);
		Rectangle r2 = new Rectangle(4, 6);
		System.out.println(r1);
		System.out.println(r2);
		r1.isSquare();		
	}
}
