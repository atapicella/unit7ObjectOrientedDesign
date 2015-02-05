import java.util.Calendar;
import java.util.GregorianCalendar;

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
        return super.format()+"][Expiration Year="+this.expYear+"\n";
    }
    
    public String toString()
    {
       return "DirverLicense["+format();
    }

    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        if (calendar.get(Calendar.YEAR)>expYear)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
