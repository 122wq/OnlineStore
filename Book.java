//Created by Jack Wang
//10/6/2025
//Book with author and publisher

import java.util.ArrayList;

public class Book extends ItemForSale
{
    ArrayList<Author> authors = new ArrayList<Author>();
    private String publisher;

    public Book()
    {
        super();
        publisher = "TestPub";
        name = "testBook";
        authors.add(new Author());
    }

    public Book (double p, String n, String d, String c, String pu, Author name)
    {
        super(p,n,d,c);
        publisher = pu;
        authors.add(name);
    }
    //precondition: must add an author
    //postconditoin: add a new author to the book
    public void addAuthor(Author au)
    {
        authors.add(au);
    }
    //precondition: none
    //postcondition: return all author dates
    public String getAuthNames()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getName() + " ";
        }
        return allNames;
    }
    //precondition: none
    //postcondition: return all author bithdays (if any)
    public String getBirDates()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getDate() + " ";
        }
        return allNames;
    }
    //precondition: must be string
    //postcondition: set publisher to desired name
    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }
}
