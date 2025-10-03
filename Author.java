public class Author
{
    String name;
    String date;

    public Author()
    {
        name = "John Doe";
        date = "01/01/1900";
    }

    public Author(String n, String d)
    {
        name = n;
        date = d;
    }
    
    public String getDate()
    {
        return date;
    }
    public String getName()
    {
        return name;
    }
}
