import java.lang.*;
public class TextBook extends Book
{
    private int standard;
    public TextBook() {System.out.println("Default Constractor of Text Book.");}
    public TextBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, int standard)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        System.out.println("Default Para Constractor of Text Book.");
        this.standard = standard;
    }
    public void setStandard(int standard) {this.standard = standard;}
    public int getStandard() {return this.standard;}
    public void showDetails()
    {
        System.out.println("ISBN: "+isbn);
        System.out.println("Book Title: "+bookTitle);
        System.out.println("Author Name: "+authorName);
        System.out.println("Price: "+price);
        System.out.println("Available Quantity: "+availableQuantity);
        System.out.println("Standard: "+this.standard);
    }
}
