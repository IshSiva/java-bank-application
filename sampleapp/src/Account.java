/**
 *
 * @author Ishwarya
 * The Account class contains the member functions and class variables which are
 * instantiated in the Bank class
 */
import javax.swing.*;
public class Account {
    /** Declaration of the class variables*/
    private final String name; //store the name of the account holder
    private double balance;//store the balance
    private final int acc_num; //since account number is not changed, set as final
    static int count = 0; //to keep track of the number of accounts
    
    

    public Account(String n,double bal) 
    {
        count++; 
	this.name = n;
        //generating a random account number based on count
	this.acc_num = count*599*254715; 
	this.balance = bal;
	
    }
    /** static function to access the static variable*/
    static int getCount()
    {
        return count;
    }
      
    /** To deduct amount on withdrawal Raises a warning if there is 
        insufficient balance*/           
    public void withdraw (double amt)
    {
        if(amt < balance)
            balance -= amt;
        else
        {    JOptionPane.showMessageDialog(null, "Insufficient Balance");//not working
            //System.out.println("Sufficient fund is not available in the account");
            
        }    
    }

    
    //credit an amount to the account
    public void credit (double amt)
    {
    	balance += amt;
    }

    //display the details of the account
    public void dispDetails()
    {
	System.out.println("Name: "+name+"\nAccount number: "+acc_num);
	System.out.println("Balance= "+balance+"\n");
    }


    
}
