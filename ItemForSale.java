//Created by Jack Wang
//10/6/2025
//Items for sale class with name, price, date, creator
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
        creator = "TestCreator";
    }
    public ItemForSale(double p, String n, String d, String c)
    {
        price = p;
        name = n;
        date = d;
        creator = c;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
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
