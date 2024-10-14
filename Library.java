public class Library {

    
    String libraryName;
    String libraryLocation;
    long contactNumber;
    int totalBooks;
    float libraryRating;

   
    public static void issueBook(int booksIssued) {
        System.out.println(booksIssued+"book has been issued.");
    }

    
    public static void returnBook(int booksRetuned) {
        System.out.println(booksRetuned+" book has been returned.");
    }

   
    public static void addNewBooks(int booksAdded) {
        System.out.println(booksAdded + " new books have been added to the library.");
    }

    
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + libraryLocation);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Library Rating: " + libraryRating);
        System.out.println("************************************");
    }
}
