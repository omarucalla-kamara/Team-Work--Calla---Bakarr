import java.util.Scanner;

public class MiniBookShop {
    public static void main(String[] args) {

        BookShop bookShop = new BookShop();
        Scanner scanner = new Scanner(System.in);

        // Seller adds books to the shop
        System.out.println("..............Seller, add books to the Shop:......................");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Book Title: ");
            String title = scanner.nextLine();
            System.out.print("Enter Author: ");
            String author = scanner.nextLine();
            System.out.print("Enter Price: NLE");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            Book newBook = new Book(title, author, price, quantity);
            bookShop.addBook(newBook);
        }

        // Buyer makes purchases
        while (true) {
            System.out.println("\n......................Buyer, make a purchase:............................");
            System.out.println("1. Display Book Items");
            System.out.println("2. Buy a Book");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    bookShop.displayShopItems();
                    break;

                case 2:
                    System.out.print("Enter the title of the book you want to buy: ");
                    String buyTitle = scanner.nextLine();
                    System.out.print("Enter the quantity you want to buy: ");
                    int buyQuantity = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character

                    bookShop.buyBook(buyTitle, buyQuantity);
                    break;

                case 3:
                    System.out.println("Exiting Mini Book Shop. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}