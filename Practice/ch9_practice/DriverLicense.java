
public class DriverLicense
    extends Card
{
    private int expYear;
    public DriverLicense(String n, int expYear)
    {
        super(n);
        this.expYear = expYear;
    }
    
    public String format()
    {
        return "Expiration Year: "+this.expYear+"\n"+super.format();
    }

}
