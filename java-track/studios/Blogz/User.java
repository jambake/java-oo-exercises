package Blogz;

import java.util.regex.Pattern;

public class User
{
	protected String username;
	private String password;
//	private static String hashPassword;
	
	public User(String username, String password)
	{
		this.username = username;
		this.password = hashPassword(password);
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
	public static boolean isValidPassword(String password)
	{
		boolean b = Pattern.matches("[a-zA-Z][a-zA-Z0-9_-]{4,11}", password);
		return b;	
	}
	
	
	
}
