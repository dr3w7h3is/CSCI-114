
/**
 * CSIS 114 Lab Travel Wallet
 *
 * @author Drew Theis
 * @version 2/24/2018
 */
public class TravelWallet
{
    // instance variables
    private double dollar;
    private double locCur;
    private double exgRate;
    
    /**
     * TravelWallet Constructor
     */
    public TravelWallet(double rate)
    {
        dollar = 100.00;
        locCur = 10000.00;
        exgRate = rate;
    }
    /**
     * Method spendLocal
     * @param locSpend subtracts amount of local currency spent
     */
    public void spendLocal(double locSpend)
    {
        // updates local currency and subtracts amout spent in local currency
        locCur -= locSpend;
    }
    /**
     * Method exchangeDollarsToLocal
     * @param amtToExch transfer from dollar to local Currency
     */
    public void exchangeDollarsToLocal(double amtToExch)
    {
        // update dollars in account from amount exchanged to currency
        dollar -= amtToExch;
        // updates local currency with amount of USD taken out times the exchange rate
        locCur += amtToExch * exgRate;
    }
    /**
     * Returns totalAmountInDollars
     * @return total value of all currencies in dollar format
     */
    public double totalAmountInDollars()
    {
        // returns the total value of the account by adding the USD and local currency in USD format
        return dollar + (locCur / exgRate);
    }
}
