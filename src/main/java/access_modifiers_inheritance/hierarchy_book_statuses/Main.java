package access_modifiers_inheritance.hierarchy_book_statuses;

public class Main {
	
	public static void main(String[] args) {
		Book book = new Book("The Lord of the Rings");
		BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
		fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
		System.out.println(book.getStatus());
	}
	
}
