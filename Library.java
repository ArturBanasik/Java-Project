
public class Library {

	public static void main (String[] args){

	final String appName = "Library v0.5";



	Book[] books = new Book[1000];
	DataReader dataReader = new DataReader();

	System.out.println(appName);	
	System.out.println("Books in the Library: ");
	books[0] = dataReader.readAndCreateBook();
	books[1] = dataReader.readAndCreateBook();
	
	dataReader.close();

	books[0].printInfo();
	books[1].printInfo();



	System.out.println("System can store " + books.length + " books.");

	}
}
