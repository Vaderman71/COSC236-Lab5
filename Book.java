package lab4.library;
 
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable; 
	
	// TODO: implement Book functionality 
	public Book (String title){
		this.title = title;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}

	public boolean getAvailable(){
		return isAvailable;
	}

	public void setAvailable(){
		isAvailable = true;
		System.out.println(title + " has been returned");
	}
}


