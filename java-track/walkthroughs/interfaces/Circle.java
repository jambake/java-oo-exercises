package interfaces;

public class Circle implements Measurable
{
	private float radius;
	
	public Circle(float r)
	{
		this.radius = r;
	}
	
	@Override
	public float getArea()
	{
		return (float)Math.PI * this.radius * this.radius;
	}

	@Override
	public float getPerimeter()
	{
		return 2 * (float)Math.PI * this.radius;
	}
	
}
