
public class Billfold
{
    Card card1 = null;
    Card card2 = null;
    
    public void addCard(Card card)
    {
        if (card1 == null)
        {
            card1 = card;
        }
        else if (card2 == null)
        {
            card2 = card;
        }
    }
    
    public String formatCards()
    {
        String format = "";
        if (card1 != null)
        {
            format+=card1.format();
        }
        if (card2 != null)
        {
            format+="\n"+card2.format();
        }
        return format;
    }
    
    public int getExpiredCardCount()
    {
        int count = 0;
        if (card1 != null)
        {
            if (card1.isExpired()==true)
            {
                count++;
            }            
        }
        if (card2 != null)
        {
            if (card2.isExpired()==true)
            {
                count++;
            } 
        }
        
        return count;
    }
}
