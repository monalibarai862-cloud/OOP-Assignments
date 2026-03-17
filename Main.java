import java.util.ArrayList;
class Book {
    String title;
    String author;
    String ISBN;

    
    Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    
    void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
    }
}


class Library {
    ArrayList<Book> books = new ArrayList<>();

    
    void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully!");
    }

    
    void removeBook(String ISBN) {
        boolean found = false;

        for (Book b : books) {
            if (b.ISBN.equals(ISBN)) {
                books.remove(b);
                System.out.println("Book removed successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found!");
        }
    }

    
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\nLibrary Books:");
        for (Book b : books) {
            b.displayBook();
        }
    }
}


 public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        
        lib.addBook(new Book("Java Basics", "James Gosling", "101"));
        lib.addBook(new Book("Python Guide", "Guido van Rossum", "102"));

        
        lib.displayBooks();

        lib.removeBook("101");

        
        lib.displayBooks();
    }
}