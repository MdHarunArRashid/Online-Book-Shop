import java.lang.*;
public class BookShop implements BookShopOperations
{
    private String name;
    private final Book[] listOfBook = new Book[100];
    public BookShop() {System.out.println("Default Constractor of Book Shop.");}
    public BookShop (String name)
    {
        this.name = name;
    }
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    public boolean insertBook(Book b)
    {
        int x = 0;
        for(int i = 0; i<listOfBook.length; i++)
        {
            if(listOfBook[i] == null)
            {
                listOfBook[i] = b;
                x = 1;
                break;
            }
        }
        if(x == 1)
        {
            System.out.println("TextBook Inserted!");
            return true;
        }
        else
        {
            System.out.println("TextBook Can't be Inserted!");
            return false;
        }
    }
    public boolean removeBook(Book b)
    {
        int flag = 0;
        for(int i = 0; i<listOfBook.length; i++)
        {
            if(listOfBook[i] == b)
            {
                listOfBook[i] = null;
                flag = 1;
                break;
            }
        }
        if (flag == 1)
        {
            System.out.println("Text Book Removed!");
            return true;
        }
        else
        {
            System.out.println("Text Book Doesn't Exist!");
            return false;
        }
    }
    public void showAllBooks()
    {
        for(int i = 0; i<listOfBook.length; i++)
        {
            if(listOfBook[i] != null)
            {
                listOfBook[i].showDetails();
                System.out.println();
            }
        }
        System.out.println();
    }
    public Book searchBook(String isbn)
    {
        Book result = null;
        for(int i = 0; i<listOfBook.length; i++)
        {
            if(listOfBook[i] !=null && listOfBook[i].getIsbn() == isbn)
            {
                result = listOfBook[i];
                break;
            }
        }
        return result;
    }
}
