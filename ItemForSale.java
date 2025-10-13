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
    //precondition: must be string
    //postcondition: set name to desired
    public void setName(String name)
    {
        this.name = name;
    }
    //precondition: must be double 
    //postcondition: set price to desired
    public void setPrice(double price)
    {
        this.price = price;
    }
    //precondition: must be string
    //postcondition: set date to desired
    public void setDate(String date)
    {
        this.date = date;
    }
    //precondition: must be string
    //postcondition: set creator to desired
    public void setCreator(String creator)
    {
        this.creator = creator;
    }
    //precondition: none
    //postcondition: get price
    public double getPrice()
    {
        return price;
    }
    //precondition: none
    //postcondition: get date
    public String getDate()
    {
        return date;
    }
    //precondition: none
    //postcondition: get name
    public String getName()
    {
        return name;
    }
    //precondition: none
    //postcondition: get creator
    public String getCreator()
    {
        return creator;
    }
}
