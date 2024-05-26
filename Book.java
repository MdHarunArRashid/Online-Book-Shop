import java.lang.*;
public abstract class Book implements BookOperations
{
    protected String isbn;
    protected String bookTitle;
    protected String authorName;
    protected double price;
    protected int availableQuantity;
    public Book() {System.out.println("Default Constractor of Book.");}
    public Book (String isbn, String bookTitle, String authorName, double price, int availableQuantity)
    {
        System.out.println("Default Para Constractor of Book.");
        this.isbn = isbn;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
        this.availableQuantity = availableQuantity;
    }
    public void setIsbn(String isbn) {this.isbn = isbn;}
    public void setBookTitle(String bookTitle) {this.bookTitle = bookTitle;}
    public void setAuthorName(String authorName) {this.authorName = authorName;}
    public void setPrice(double price) {this.price = price;}
    public void setAvailableQuantity(int availableQuantity) {this.availableQuantity = availableQuantity;}
    public String getIsbn() {return this.isbn;}
    public String getBookTitle() {return this.bookTitle;}
    public String getAuthorName() {return this.authorName;}
    public double getPrice() {return this.price;}
    public int getAvailableQuantity() {return this.availableQuantity;}
    public void addQuantity(int amount) {System.out.println("Add Quantity: "+amount);}
    public void sellQuantity(int amount) {System.out.println("Sell Quantity: "+amount);}
    public abstract void showDetails();
}
