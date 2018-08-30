
/**
 *
 * @author Ishwarya
 */

/**
 * If the account balance is higher than 100000 then the custom is Golden Customer
 * 
 */
public class GoldenCustomer extends Customer{
    private final double int_rate;
    
    GoldenCustomer(String na, double bal)
    {
        super(na, bal);
        int_rate = 0.10; //interest rate
        System.out.println("\nYou are a Gold customer. You can enjoy special privileges");
    
    }
    
    
      
    @Override
    public String toString()
    {
        return String.format("\n%s:%s\n%s:%d\n%s:%.2f", "\nName: ",super.name,"Account Number: ", super.acc_num, "Balance: ", super.balance);
    
    }
    
    
    
    
    
}
