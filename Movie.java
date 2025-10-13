//Created by Jack Wang
//10/6/2025
//movie with income  
public class Movie extends ItemForSale
{
    private int duration;

    public Movie()
    {
        super();
        name = "testMovie";
        duration = 99;
    }

    public Movie(double p, String n, String d, String c, int dr)
    {
        super(p,n,d,c);
        duration = dr;
    }
    //precondition: none
    //postcondition: get duration
    public int getDuration()
    {
        return duration;
    }
}
