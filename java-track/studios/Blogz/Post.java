package Blogz;

import java.util.Date;

public class Post
{
	private String title, body, author;
	private final Date created;
	private Date modified;
	
	public Post(String title, String body, String author)
	{
		this.title = title;
		this.body = body;
		this.author = author;
		this.created = created;
		this.modified = modified;
	}
}
