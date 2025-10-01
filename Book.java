import java.util.ArrayList;

public class Book extends ItemForSale
{
    ArrayList<Author> authors = new ArrayList<Author>();
    private String publisher;

    public Book()
    {
        super();
        publisher = "TestPub";
    }

    public Book (double p, String n, String d, String c, String pu)
    {
        super(p,n,d,c);
        publisher = pu;
    }

    public void addAuthor(Author au)
    {
        authors.add(au);
    }

    public String getNames()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getName() + " ";
        }
        return allNames;
    }

    public String getDates()
    {
        String allNames = "";
        for (int i = 0; i < authors.size(); i++)
        {
            allNames += authors.get(i).getDate() + " ";
        }
        return allNames;
    }

    public String getPublisher()
    {
        return publisher;
    }
}
