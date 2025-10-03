public class ItemForSale
{
    protected double price;
    protected String name;
    protected String date;
    protected String creator;

    public ItemForSale()
    {
        price = 10.0;
        name = "Test";
        date = "01/01/1900";
        creator = "Test";
    }
    public ItemForSale(double p, String n, String d, String c)
    {
        price = p;
        name = n;
        date = d;
        creator = c;
    }

    public double getPrice()
    {
        return price;
    }
    public String getDate()
    {
        return date;
    }
    public String getName()
    {
        return name;
    }
    public String getCreator()
    {
        return creator;
    }
}
