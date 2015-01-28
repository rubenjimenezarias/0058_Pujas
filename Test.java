
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public void test1()
    {
        Auction auction = new Auction();
        Person person1 = new Person("Ruben");
        Person person2 = new Person("Bea");
        
        auction.enterLot("coche");
        auction.enterLot("moto");
        auction.enterLot("avion");
        auction.makeABid(1,person1,100);
        auction.makeABid(2,person2,200);
        
        
        auction.getLot(2);
    }
    
    
}
