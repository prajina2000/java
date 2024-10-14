public class LibraryInfo {

    public static void main(String[] args) {

        
        Library library1 = new Library();
        library1.libraryName = "City Central Library";
        library1.libraryLocation = "MG Road";
        library1.contactNumber = 9876543210L;
        library1.totalBooks = 10000;
        library1.libraryRating = 4.5f;

        
        library1.displayLibraryDetails();
        Library.issueBook(8);
        Library.returnBook(1);
        Library.addNewBooks(50);
        
        System.out.println("*****************************************************");

       
        Library library2 = new Library();
        library2.libraryName = "Community Library";
        library2.libraryLocation = "BTM Layout";
        library2.contactNumber = 8765432109L;
        library2.totalBooks = 2500;
        library2.libraryRating = 4.0f;

        
        library2.displayLibraryDetails();
        Library.issueBook(8);
        Library.returnBook(2);
        Library.addNewBooks(100);

        System.out.println("*****************************************************");

       
        Library library3 = new Library();
        library3.libraryName = "National Library";
        library3.libraryLocation = "Koramangala";
        library3.contactNumber = 7654321098L;
        library3.totalBooks = 15000;
        library3.libraryRating = 4.8f;

        
        library3.displayLibraryDetails();
        Library.issueBook(6);
        Library.returnBook(3);
        Library.addNewBooks(200);

        System.out.println("*****************************************************");

       
        Library library4 = new Library();
        library4.libraryName = "University Library";
        library4.libraryLocation = "HSR Layout";
        library4.contactNumber = 6543210987L;
        library4.totalBooks = 8000;
        library4.libraryRating = 4.7f;

        
        library4.displayLibraryDetails();
        Library.issueBook(8);
        Library.returnBook(0);
        Library.addNewBooks(70);

        System.out.println("*****************************************************");

        Library library5 = new Library();
        library5.libraryName = "Digital Library";
        library5.libraryLocation = "Electronic City";
        library5.contactNumber = 5432109876L;
        library5.totalBooks = 5000;
        library5.libraryRating = 4.9f;

        
        library5.displayLibraryDetails();
        Library.issueBook(5);
        Library.returnBook(1);
        Library.addNewBooks(300);

        System.out.println("*****************************************************");

        
        
        Library library6 = new Library();
        library6.libraryName = "Public Library";
        library6.libraryLocation = "Jayanagar";
        library6.contactNumber = 4321098765L;
        library6.totalBooks = 4500;
        library6.libraryRating = 4.3f;

        
        library6.displayLibraryDetails();
        library6.issueBook(10);
        library6.returnBook(9);
        library6.addNewBooks(75);

        System.out.println("*****************************************************");

       
        Library library7 = new Library();
        library7.libraryName = "Knowledge Hub Library";
        library7.libraryLocation = "Whitefield";
        library7.contactNumber = 3210987654L;
        library7.totalBooks = 9500;
        library7.libraryRating = 4.6f;

       
        library7.displayLibraryDetails();
        library7.issueBook(9);
        library7.returnBook(3);
        library7.addNewBooks(120);

        System.out.println("*****************************************************");

        
        Library library8 = new Library();
        library8.libraryName = "Tech Community Library";
        library8.libraryLocation = "Marathahalli";
        library8.contactNumber = 2109876543L;
        library8.totalBooks = 3200;
        library8.libraryRating = 4.4f;

        
        library8.displayLibraryDetails();
        library8.issueBook(9);
        library8.returnBook(5);
        library8.addNewBooks(90);

        System.out.println("*****************************************************");

        
        Library library9 = new Library();
        library9.libraryName = "Historical Library";
        library9.libraryLocation = "Vijayanagar";
        library9.contactNumber = 1098765432L;
        library9.totalBooks = 7000;
        library9.libraryRating = 4.2f;

       
        library9.displayLibraryDetails();
        library9.issueBook(2);
        library9.returnBook(1);
        library9.addNewBooks(140);

        System.out.println("*****************************************************");

        
        Library library10 = new Library();
        library10.libraryName = "Elite Readers Library";
        library10.libraryLocation = "Indiranagar";
        library10.contactNumber = 9876543201L;
        library10.totalBooks = 12000;
        library10.libraryRating = 4.9f;

        
        library10.displayLibraryDetails();
        library10.issueBook(8);
        library10.returnBook(4);
        library10.addNewBooks(300);

        System.out.println("*****************************************************");

    }
}
