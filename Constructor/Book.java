package Constructor;

public class Book {
	String title;
	String author;
	double price;
	
	public Book(String tName, String aName, double bPrice)
	{
		title = tName;
		author = aName;
		price = (bPrice>500)?(bPrice - bPrice*0.50):(bPrice);
	}

	public static void main(String[] args) {
		Book b = new Book("Susil","God", 700);
		System.out.println(b.price); 
	}

}
