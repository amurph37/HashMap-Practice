import java.util.HashMap;

public class Program {
    // Method to print all values in the hashmap
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print values where the Book name contains the given string
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {
        // Test the methods
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("first", new Book("Sense and Sensibility", 1811, "Content of Sense and Sensibility"));
        hashmap.put("second", new Book("Pride and Prejudice", 1813, "Content of Pride and Prejudice"));
        hashmap.put("third", new Book("The Great Gatsby", 1925, "Content of The Great Gatsby"));

        System.out.println("All values:");
        printValues(hashmap);

        System.out.println("\nValues of books where name contains 'and':");
        printValueIfNameContains(hashmap, "and");
    }
}
