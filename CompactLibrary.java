import java.util.Stack;

// Use a record for a concise Book class (auto-generates constructor, getters, toString, etc.)
record Book(String title, String author) {}

public class CompactLibrary {

    // Overloaded method 1: Displays a single Book
    public static void display(Book book) {
        System.out.println("--- Single Book ---");
        System.out.println(book);
    }

    // Overloaded method 2: Displays a Stack of Books
    public static void display(Stack<Book> bookStack) {
        System.out.println("\n--- Book Stack (" + bookStack.size() + " books) ---");
        // Print the stack in reverse for a top-down view
        for (int i = bookStack.size() - 1; i >= 0; i--) {
            System.out.println(bookStack.get(i));
        }
    }

    public static void main(String[] args) {
        // Create and populate the stack
        Stack<Book> myBookStack = new Stack<>();
        myBookStack.push(new Book("1984", "George Orwell"));
        myBookStack.push(new Book("Dune", "Frank Herbert"));
        myBookStack.push(new Book("The Hobbit", "J.R.R. Tolkien"));

        // Call the overloaded methods directly
        display(myBookStack);      // Calls the Stack version
        display(myBookStack.peek()); // Calls the single Book version
    }
}