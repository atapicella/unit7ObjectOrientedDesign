    public class Card
{
   private String name;


   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public boolean cardEquals(Object otherObject)
   {
       if (this.getClass() == otherObject.getClass())
       {
           Card other = (Card) otherObject;
           return this.name.equals(other.name);
        }
        return false;
    }
    
   public boolean IDEquals(Object otherObject)
   {
       if (this.getClass() == otherObject.getClass())
       {
           IDCard other = (IDCard) otherObject;
           return this.getName().equals(other.getName()) && this.idNumber.equals(other.idNumber);
        }
        return false;
    } 
    
   public boolean callingCardEquals(Object otherObject)
   {
       if (this.getClass() == otherObject.getClass())
       {
           CallingCard other = (CallingCard) otherObject;
           return this.getName().equals(other.getName()) && this.cardNumber.equals(other.cardNumber)&& this.pin == other.pin;;
        }
        return false;
    } 
}
