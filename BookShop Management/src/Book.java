import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Base class - Book
public class Book {

    int quantity;
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price, int quantity) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: NLE" + price + ", Quantity: " + quantity);
    }
}

// Shop class
class BookShop{

    private List<Book> items;

    public BookShop() {
        this.items = new ArrayList<>();
    }

    public void addBook(Book book) {
        items.add(book);
        System.out.println("Book added to the shop.");
    }

    public void displayShopItems() {
        System.out.println("ShopItems:");
        Iterator<Book> iterator = items.iterator();
        while (iterator.hasNext()) {
            iterator.next().displayInfo();
        }
    }

    public boolean buyBook(String title, int quantity) {
        for (Book book : items) {
            if (book.getTitle().equalsIgnoreCase(title) && book.getQuantity() >= quantity) {
                book.quantity -= quantity;
                System.out.println("Purchase successful. Total cost: NLE" + (book.getPrice() * quantity));
                return true;
            }
        }
        System.out.println("Book not available or insufficient quantity.");
        return false;
    }
}
