package studio2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTester
{

	@Test
	public void testAddFrac()
	{
		Fraction f = new Fraction(3, 6);
		Fraction f2 = new Fraction(2, 4);
		assertEquals(f2.addFrac(f), f.addFrac(f2));
	}

}
