
/**
 *
 * @author Ishwarya
 */

/**
 * 
 * If the balance is less than 100000 then the customer is a Silver Customer
 */
public class SilverCustomer extends Customer{
    private final double int_rate ;
    
    public SilverCustomer(String na, double bal) {
        super(na, bal);
        int_rate = 0.10;
        System.out.println("\nYou are a silver customer.");
    }
    
    
    @Override
    public String toString()
    {
        return String.format("\n%s:%s\n%s:%d\n%s:%.2f", "\nName: ",super.name,"Account Number: ", super.acc_num, "Balance: ", super.balance);
    
    }
   
    
}
