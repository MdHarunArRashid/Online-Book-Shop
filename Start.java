import java.lang.*;
import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookShop bs = new BookShop("Book Worm");

        while (true) {
            System.out.println("1. Insert Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Show All Books");
            System.out.println("4. Search Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose Book Type:");
                    System.out.println("1. TextBook");
                    System.out.println("2. StoryBook");
                    int typeChoice = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = scanner.nextLine();
                    System.out.print("Enter Author Name: ");
                    String authorName = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Available Quantity: ");
                    int availableQuantity = scanner.nextInt();

                    if (typeChoice == 1) {
                        System.out.print("Enter Standard: ");
                        int standard = scanner.nextInt();
                        TextBook tb = new TextBook(isbn, bookTitle, authorName, price, availableQuantity, standard);
                        bs.insertBook(tb);
                    } else if (typeChoice == 2) {
                        scanner.nextLine();
                        System.out.print("Enter Category: ");
                        String category = scanner.nextLine();
                        StoryBook sb = new StoryBook(isbn, bookTitle, authorName, price, availableQuantity, category);
                        bs.insertBook(sb);
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Enter ISBN of the book to remove: ");
                    String removeIsbn = scanner.nextLine();
                    Book bookToRemove = bs.searchBook(removeIsbn);
                    if (bookToRemove != null) {
                        bs.removeBook(bookToRemove);
                    } else {
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 3:
                    bs.showAllBooks();
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.print("Enter ISBN of the book to search: ");
                    String searchIsbn = scanner.nextLine();
                    Book bookToSearch = bs.searchBook(searchIsbn);
                    if (bookToSearch != null) {
                        System.out.println("Book Found!");
                        bookToSearch.showDetails();
                    } else {
                        System.out.println("Book Not Found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

