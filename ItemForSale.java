public class ItemForSale
{
    protected double prize;
    protected String name;
    protected String date;
    protected String creator;

    public ItemForSale()
    {
        prize = 0.0;
        name = "Test";
        date = "01/01/1900";
        creator = "Test";
    }
    public ItemForSale(double p, String n, String d, String c)
    {
        prize = p;
        name = n;
        date = d;
        creator = c;
    }

    public double getPrize()
    {
        return prize;
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
