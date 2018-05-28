
public class Book {
	// Fields
	String title;
	String author;
	int releaseDate;
	int pages;
	String publisher;
	String isbn;

	// Constructors
	public Book(String title, String author, int releaseDate, int pages, String publisher, String isbn){
	this.title = title;
	this.author = author;
	this.releaseDate = releaseDate;
	this.pages = pages;
	this.publisher = publisher;
	this.isbn = isbn;
	}


	public Book(Book book) {
		this(book.title, book.author, book.releaseDate, book.pages, book.publisher, book.isbn);
	}



	//all setters and getters

	 public String getTitle() {
		return title;
	    }
	 
	    public void setTitle(String title) {
		this.title = title;
	    }
	 
	    public String getIsbn() {
		return isbn;
	    }
	 
	    public void setIsbn(String isbn) {
		this.isbn = isbn;
	    }
	 
	    public String getPublisher() {
		return publisher;
	    }
	 
	    public void setPublisher(String publisher) {
		this.publisher = publisher;
	    }
	 
	    public int getPages() {
		return pages;
	    }
	 
	    public void setPages(int pages) {
		this.pages = pages;
	    }
	 
	    public int getReleaseDate() {
		return releaseDate;
	    }
	 
	    public void setReleaseDate(int releaseDate) {
		this.releaseDate = releaseDate;
	    }
	 
	    public String getAuthor() {
		return author;
	    }
	 
	    public void setAuthor(String author) {
		this.author = author;
	    }


	public void printInfo() {
        String info = getTitle() + "; " + getAuthor() + "; " + getReleaseDate() + "; " + getPages()
                + "; " + getPublisher() + "; " + getIsbn();
        System.out.println(info);
    }
}
