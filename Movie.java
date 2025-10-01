public class Movie extends ItemForSale
{
    private int duration;

    public Movie()
    {
        super();
        duration = 99;
    }

    public Movie(double p, String n, String d, String c, int dr)
    {
        super(p,n,d,c);
        duration = dr;
    }

    public int getDuration()
    {
        return duration;
    }
}
