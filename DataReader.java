import java.util.Scanner;

public class DataReader {

	private Scanner sc;

	public DataReader() {
		sc = new Scanner(System.in);
	}

	public void close(){
		sc.close();
	}

	public Book readAndCreateBook(){
	System.out.print("Title: ");
	String title = sc.nextLine();
	
	System.out.print("Author: ");
	String author = sc.nextLine();

	System.out.print("Publisher: ");
	String publisher = sc.nextLine();

	System.out.print("ISBN: ");
	String isbn = sc.nextLine();

	System.out.print("Year: ");
	int releaseDate = sc.nextInt();
	sc.nextLine();

	System.out.print("Pages: ");
	int pages = sc.nextInt();
	sc.nextLine();

	return new Book(title,author,releaseDate, pages,publisher,isbn);

	}

}
