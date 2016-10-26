package Blogz;

//import java.util.Objects;

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
	
	
//	@Override
//	public boolean equals(Object o){
//		// self check
//		if(this == o)
//			return true;
//		// null check
//		if(o == null)
//			return false;
//		// type-check and cast
//		if(!(o instanceof User))
//			return false;
//		
//		User p = (User) o;
//		
//		return Objects.equals(username, p.username);
//	}
}
