class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("----------------------");
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        
        // Creating array of Book objects
        Book[] books = new Book[3];

        // Initializing objects
        books[0] = new Book("Java Basics", "James Gosling", 450);
        books[1] = new Book("Python Guide", "Guido van Rossum", 500);
        books[2] = new Book("C Programming", "Dennis Ritchie", 400);

        // Displaying details of all books
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}
