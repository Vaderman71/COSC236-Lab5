package lab4.library;

public class Member {
    private static int nextId = 1;

    private int memberId;
    private String name;
    private List<Book> borrowedBooks;

    public Member(String name) {
        this.memberId = nextId++;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public int getMemberId() { return memberId; }
    public String getName() { return name;}
    public List<Book> getBorrowedBooks() { return borrowedBooks; }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public boolean returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            return true;
        }
        return false;
    }

    public boolean hasBook(Book book) {
        return borrowedBooks.contains(book);
    }

    public List<String> getBorrowedBookTitles() {
        List<String> titles = new ArrayList<>();
        for (Book book : borrowedBooks) {
            titles.add(book.getTitle());
        }
        return titles;
    }
}
