public class Library {

	public static void main (String[] args){

	final String appName = "Library v0.2";


	Book bookObject = new Book();

	bookObject.title = "Thinking In Java";
	bookObject.author = "Bruce Eckel";
	bookObject.releaseDate = 2010;
	bookObject.pages = 1213;
	bookObject.publisher = "Helion";
	bookObject.isbn = "9788328334427";

	System.out.println(appName);
	System.out.println("Books in the library: ");
	System.out.println(bookObject.title);
	System.out.println(bookObject.author);
	System.out.println(bookObject.releaseDate);
	System.out.println(bookObject.pages);
	System.out.println(bookObject.publisher);
	System.out.println(bookObject.isbn);
	}
}
