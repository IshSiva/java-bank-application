
/**
 *
 * @author Ishwarya
 */

/**
 * The class Customer is abstract.
 * It has a set of variables and methods which are inherited by the GoldenCustomer
   class and Silver Customer class.
 * Based on the bank balance the category of customer is decided.
 */

public abstract class Customer {
    
    protected final String name; //name of the customer
    protected int acc_num; //account number of the customer
    protected double balance; //account balance
    
    static int count = 0; //number of customers
    
    Customer(String na, double bal)
    {
        count++;
        name = na;
        acc_num = count*599*254715;
        balance = bal;
        
        
    }
    
    //Getters and setters methods
    static int getCount()
    {
        return count;
    
    }
    
    public int getAccNum()
    {
    
        return acc_num;
    }
    public double getBal()
    {
        return balance;
    }
    
    public void setBal(double amount)
    {
        balance += amount;
    
    }
    public void dispDetails()
    {
        System.out.println("\nAccount Number: "+acc_num+ "\nBalance: "+balance);
        
    
    }
    
    
}
