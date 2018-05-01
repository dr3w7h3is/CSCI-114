
/**
 * Writing a Class Homework
 *
 * @author Drew Theis
 * @version 02/17/2018
 */
public class Stock
{
    //  Variables
    private String symb;
    private double currentPrice;
    public Stock(String symb, double currentPrice)
    {
        // Initializes variables
        this.symb = symb;
        this.currentPrice = currentPrice;
    }
    // Returns symbol for Stock
    public String getSymbol()
    {
        return this.symb;
    }
    // Returns Price for Stock
    public double getPrice()
    {
        return this.currentPrice;
    }
    // Creates new price from currentPrice and times the percentage of increase
    public void changePrice(double byPercent)
    {
        this.currentPrice += (this.currentPrice * byPercent) / 100;
    }
}
