package Blogz;

public abstract class Entity
{
	private final int uid;
	private static int counter = 1;
	
	public Entity()
	{
		this.uid = counter++;
	}
	
	public int getUID()
	{
		return this.uid;
	}
}
