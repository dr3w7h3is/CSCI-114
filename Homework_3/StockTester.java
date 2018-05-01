/**
 * Tests the Stock class.
 * 
 * @author Anthony W. Smith 
 * @version 5/31/2028
 */
public class StockTester
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        Stock apple = new Stock("AAPL", 156.41);
        apple.changePrice(25.0);	// Apple up 25.0%!

        System.out.println(apple.getSymbol() + " now at: " +
                                                  apple.getPrice());

        Stock oracle = new Stock("ORCL", 47.73);
        oracle.changePrice(-10.0);	// Oracle down 10.0!

        System.out.println(oracle.getSymbol() + " now at: " +
                                                  oracle.getPrice());
    }
}