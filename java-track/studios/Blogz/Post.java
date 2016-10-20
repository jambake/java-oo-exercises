package Blogz;

import java.util.Date;

public class Post extends Entity
{
	private String title, body, author;
	private final Date created;
	//Constructor
	public Post(String title, String body, String author, Date created)
	{
		super();
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = created;
	}
	//Getters
	public String getTitle()
	{
		return title;
	}
	public String getBody()
	{
		return body;
	}
	public String getAuthor()
	{
		return author;
	}
	public Date getCreated()
	{
		return created;
	}
	//Setters
	public void setTitle(String newTitle)
	{
		this.title = newTitle;
	}
	public void setBody(String newBody)
	{
		this.body = newBody;
	}
	public void setAuthor(String newAuthor)
	{
		this.author = newAuthor;
	}
	
	public void isModified()
	{
		// TODO
	}
	
	
}
