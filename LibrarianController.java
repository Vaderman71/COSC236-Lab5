package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.

	// TODO: implement functionality of LibrarianController class

	private Library library;

	public LibrarianController(){
		this.library = new Library();
	}

	public void addMember(String name){
		int id = 1000 + (name.hashCode() % 10);
		Member member = new Member(id, name);
		this.library.addMember(member);
	}

	public void showBooks(){
		this.library.showBooks();
	}

	public void showMembers(){
		this.library.showMembers();
	}

	public void returnBook(Book book, Member member){
		if(!this.library.containsMember(member)) 
			return;
		if(member.hasBook(book)){
			member.removeBook(book);
			this.library.addBook(book);
		}
	}

	public void borrowBook(Book book, Member member) {
		if(!this.library.containsMember(member))
			return;

		if (this.libray.containsBook(book)) {
			this.library.removeBook(book);
			member.borrowBook(book);
		}
	}

}