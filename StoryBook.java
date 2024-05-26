import java.lang.*;
public class StoryBook extends Book
{
    private String category;
    public StoryBook() {System.out.println("Default Constractor of Story Book.");}
    public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity, String category)
    {
        super(isbn,bookTitle,authorName,price,availableQuantity);
        System.out.println("Default Para Constractor of Story Book.");
        this.category = category;
    }
    public void setCategory(String category) {this.category = category;}
    public String getCategory() {return this.category;}
    public void showDetails()
    {
        System.out.println("ISBN: "+isbn);
        System.out.println("Book Title: "+bookTitle);
        System.out.println("Author Name: "+authorName);
        System.out.println("Price: "+price);
        System.out.println("Available Quantity: "+availableQuantity);
        System.out.println("Category: "+this.category);
    }
}
