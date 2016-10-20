package Blogz;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class User extends Entity
{
	private String username;
	private  String password;
	private static final ArrayList <User> allUsers = new ArrayList<User>();
	 
	public User(String username, String password)
	{
		super();
		if (isValidUsername(username))
		{
			this.username = username;
		}
		else
		{
			throw new PatternSyntaxException("Invalid Username", "Must be 4-12 characters long, starts with a letter, and contains only letters, numbers, -, and _.", -1); 
		}	
		this.password = hashPassword(password);
		allUsers.add(this);
	}
	
	public String getUsername()
	{
		return this.username;
	}
	public String getPassword()
	{
		return this.password;
	}
	
	public String setPassword(String newPassword)
	{
		password = hashPassword(newPassword);
		return password;
	}
	
	private static String hashPassword(String password)
	{
		return password;
	}
	
	public boolean isValidPassword()
	{
		if (this.password == hashPassword(password))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static boolean isValidUsername(String username)
	{
		boolean isValid = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", username);
		return isValid;	
	}
	
	public static List<User> getAllUsers()
	{
		return User.allUsers;
	}
	
	
	
	
}
