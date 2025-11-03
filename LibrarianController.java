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
		if(!this.library.containsMember(member)){
			System.out.println("Member " + member.getName() + " not found.");
		}
		if(member.hasBook(book)){
			member.removeBook(book);
			this.library.addBook(book);
			System.out.println(member.getName() + " has successfully returned " + book.getTitle());
		}
		else{
			System.out.println(member.getName() + " didn't borrow " + book.getTitle());
		}
	}

	public void borrowBook(Book book, Member member) {
		if(!this.library.containsMember(member)){
			System.out.println("Member " + memberName + " not found.");
		}

		if (this.libray.containsBook(book)) {
			this.library.removeBook(book);
			member.borrowBook(book);
			System.out.println(memberName + " has successfully borrowed " + bookName);
		} else {
			System.out.println(bookName + " is either already borrowed or not available.");
		}
	}


}