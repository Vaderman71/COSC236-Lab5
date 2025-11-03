package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.

	// TODO: implement functionality of LibrarianController class

	//A librarian Controller only has one library they controller
	private Library library;

	public LibrarianController(){
		this.library = new Library();
	}

	public void addBook(String bookTitle, String author){
		this.library.addBook(new Book(bookTitle, author));
	}

	public void addMember(String name){
		this.library.registerMember(name);
	}

	public void showAvailableBooks(){
		this.library.showBooks();
	}

	public void showMembers(){
		this.library.showMembers();
	}

	public void returnBook(String bookTitle, String memberName){
		Member member = this.library.findMemberByName(memberName);
		if(member == null){
			System.out.println(memberName + " not registered at the library.");
			return;
		}
		Book book = member.hasBook(bookTitle);
		if(book != null) {
			member.returnBook(book);
			this.library.addBook(book);
			System.out.println(memberName + " has successfully returned " + bookTitle);
		}else {
			System.out.println(memberName + " didn't borrow " + bookTitle);
		}
	}

	public void borrowBook(String bookTitle, String memberName) {
		Member member = this.library.findMemberByName(memberName);
		if(member == null){
			System.out.println(memberName + " not registered at the library.");
			return;
		}
		Book book = this.library.findBookbyTitle(bookTitle);
		if(book != null){
			this.library.removeBook(book);
			member.borrowBook(book);
			System.out.println(memberName + " has successfully borrowed " + bookTitle);
		}else {
			System.out.println(bookTitle + " is either already borrowed or not available.");
		}
	}

}