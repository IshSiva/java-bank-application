/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ishwarya
 */
public class Transaction extends Bank
{
    int ac_num;
    double amt;
    private Customer[] cust_details; //has the array of Customer objects
     /**
     * @param ac_n: has the account number passed from main()
     * @param amt: amount to be deposited or withdrawn
     */
    Transaction(int ac_num, double amt, Customer c[])
    {
        this.ac_num = ac_num;
        this.amt = amt;
        cust_details = c.clone();
              
    
    }
    
    /** 
         Search for the account number and deposit or withdraw money from that 
          account. If the account number is not found, then the error message is
          printed.
         */
    
    
    public void withdraw ()
    {
        
        int i;
        
        for(i=0; i<Customer.getCount();i++)
        {
            if((cust_details[i].getAccNum()) == ac_num )
            {    
                if(amt < cust_details[i].getBal())
                {
                    cust_details[i].setBal(amt*(-1));
                    cust_details[i].dispDetails();
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
    
    public void deposit ()
    {
        int i;
        for(i=0; i<Customer.getCount();i++)
        {
            if(cust_details[i].acc_num == ac_num )
            {    
                cust_details[i].setBal(amt);
                //cust_details[i].dispDetails();
                return;
            }
        }
        System.out.println("Account number not found");
    	
    }
    
    

    
    
    
}
