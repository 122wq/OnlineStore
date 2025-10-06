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

    public void addAuthor(Author au)
    {
        authors.add(au);
    }

    public String getAuthNames()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getName() + " ";
        }
        return allNames;
    }

    public String getBirDates()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getDate() + " ";
        }
        return allNames;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getPublisher()
    {
        return publisher;
    }
}
