
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
       return "Id Number: "+ this.idNumber+ "\n"+ super.format();
    }

}
