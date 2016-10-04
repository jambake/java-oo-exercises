package studio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class RectangleTester
{

	@Test
	public void testIsSmaller()
	{
		Rectangle r = new Rectangle(4, 5);
		Rectangle r2 = new Rectangle(5,6);
		assertTrue("Problem comparing multiple rectangle objects", r.isSmaller(r2));
	}
	
	@Test
	public void testIsSquare()
	{
		Rectangle r = new Rectangle(5, 5);
		assertTrue("Problem comparing sides of recatngle object", r.isSquare());
	}

}
