
public class BilfoldTester
{
    public static void main(String args[])
    {
        Billfold cards = new Billfold();
        CallingCard callCard = new CallingCard("Andrew", 987654321, 5555);
        DriverLicense license = new DriverLicense("Andrew", 2013);
        cards.addCard(license);
        cards.addCard(callCard);
        System.out.println(cards.getExpiredCardCount());
    }

}
