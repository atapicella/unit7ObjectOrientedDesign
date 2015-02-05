
public class CallingCard
    extends Card
{
   private int cardNumber;
   private int pin;
    public CallingCard(String n, int cardNumber, int pin)
   {
       super(n);
       this.cardNumber = cardNumber;
       this.pin = pin;
   }
   
   public String format()
    {
        return super.format()+"][Number="+this.cardNumber+",pin="+this.pin+"\n";
    }
    
   public String toString()
   {
       return "CallingCard["+format();
    }
}
