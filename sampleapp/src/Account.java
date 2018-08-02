/**
 *
 * @author Ishwarya
 * The Account class contains the member functions and class variables which are
 * instantiated in the Bank class
 */

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
      
    /**
     * @param acc: has the account number passed from main()
     * @param b: contains the array of Account objects created
     * @param amt: amount to be deposited or withdrawn
     */
               
    public void withdraw (int acc, Account b[], double amt)
    {
        int i=0;
        for(i=0; i<Account.getCount();i++)
        {
            if(b[i].acc_num == acc )
            {    
                if(amt < balance)
                {
                    b[i].balance -= amt;
                    b[i].dispDetails();
                    return;
                }
                
                else
                {    
                    System.out.println("Sufficient fund is not available in the account");

                }
            }
        }
        System.out.println("Account number not found");
    }

    
    //credit an amount to the account
    public void credit (int acc, Account b[], double amt)
    {
        int i=0;
        for(i=0; i<Account.getCount();i++)
        {
            if(b[i].acc_num == acc )
            {    
                b[i].balance += amt;
                b[i].dispDetails();
                return;
            }
        }
        System.out.println("Account number not found");
    	
    }

    //display the details of the account
    public void dispDetails()
    {
	System.out.println("Name: "+name+"\nAccount number: "+acc_num);
	System.out.println("Balance= "+balance+"\n");
    }


    
}
