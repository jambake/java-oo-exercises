package studio2;

public class Rectangle
{
	private int length;
	private int width;
	private int area;
	private int perim;
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
		this.area = length * width;
		this.perim = (length * 2) + (width * 2);
	}

	public int getLength()
	{
		return length;
	}

	public int getWidth()
	{
		return width;
	}

	public String getIsSquare()
	{
		if (length == width)
		{
			return "Is a square.";
		} 
		else
		{
			return "Is not a square.";
		}
	}
	
//	public Boolean getIsBigger()
//	{
//		if (r1.area > r2.area)
//		{
//			return true;
//		} else
//		{
//			return false;
//		}
//	}
	
	public void setLength(int newLength)
	{
		this.length = newLength;
	}

	public void setWidth(int newWidth)
	{
		this.width = newWidth;
	}
	
	public String toString()
	{
		return "Length: " + this.length + " Width: " + this.width + " Area: " + this.area + " Perimeter: " + this.perim;
	}
	
	public static void main(String[] args)
	{
		Rectangle r1 = new Rectangle(3, 5);
		Rectangle r2 = new Rectangle(4, 6);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r1.getIsSquare());
		
	}
}
