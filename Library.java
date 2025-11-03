package lab4.library;

public class Library {
	
	private List<Book> bookList;
	
	private List<Member> memberList;
	
	public void addBook(Book b){
		bookList.add(b);
	}
	
	public void registerMember(Member m){
		memberList.add(m);
	}
	
	public void showBooks(){
		for(int i = 0; i < bookList.size(); i++){
			System.out.println(book.get(i));
		}
	}
	
	public void showMembers(){
		for(int i = 0; i < bookList.size(); i++){
			System.out.println(members.get(i));
		}
	}
	
	public Book findBookByTitle(String title){
		for(int i = 0; i < bookList.size(); i++){
			if(bookList.at(i).getTitle().equals(title)){
				return bookList.at(i);
			}
		}
		return null;
	}

	public Member findMemberByName(String name){
		for(int i = 0; i < MemberList.size(); i++){
			if(MemberList.at(i).getName().equals(name)){
				return MemberList.at(i);
			}
		}
		return null;
	}
}
