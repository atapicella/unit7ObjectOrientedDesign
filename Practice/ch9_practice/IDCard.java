
public class IDCard
    extends Card
{
   private String idNumber;
   public IDCard(String n, String id)
   {  
      super(n);
      this.idNumber = id;
   }
   
   public String format()
   {
       return super.format()+"][Id Number="+this.idNumber+"\n";
    }
    
   public String toString()
   {
       return "IDCard["+format();
    }

}
