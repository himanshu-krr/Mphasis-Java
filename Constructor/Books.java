package Constructor;

public class Books {
	String title;
	String author;
	
	public Books(String title, String author)
	{
		this.title = title;
		this.author = author;
	}
	
	public Books(Books otherBooks)
	{
		this.title = otherBooks.title;
		this.author = otherBooks.author;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor()
	{
		this.author = author;
	}

	public static void main(String[] args) {
		
		
		

	}

}
