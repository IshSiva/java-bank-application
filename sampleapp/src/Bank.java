

/**
 *  @author Ishwarya
 * This application gets the account holder's name and the amount to be
 deposited.
 * It then creates the objects of the type class Account instantiates them
 and calls the member functions.
 */


import java.util.Scanner;
public class Bank {
    
    public static void main(String[] args)
	{
            //Define an object of type Scanner to get the input
            Scanner inp = new Scanner(System.in); 
            String name; //Local variable to get the name
            double bal; //Local variable to get the balance
            
            
            //Getting the inputs from the user
            System.out.println("Enter the name: ");
            name = inp.nextLine();
            System.out.println("Enter the balance: ");
            bal = inp.nextDouble();
            Account a1 = new Account(name, bal); //Creating Account object a1
            
            
            inp.nextLine();
            /**The above command is to remove the newline character after 
               inp.nextDouble() since it is not consumed by it and this affects 
               the string input in the following lines*/
            
            System.out.println("Enter the name: ");
            name = inp.nextLine();
            System.out.println("Enter the balance: ");
            bal = inp.nextDouble();
            Account a2 = new Account(name, bal); //Creating Account object a2
		
            //Displaying the input details
            a1.dispDetails();
            a2.dispDetails();
		
            /**For this app we just withdraw money from a1 and deposit in a2 */
		
            System.out.println("Enter the amount to be withdrawn from a1");
            double w_d = inp.nextDouble();
            a1.withdraw(w_d);
            a1.dispDetails();
		

            System.out.println("Enter the amount to be deposited in a2: ");
            double deposit = inp.nextDouble();
            a2.credit(deposit);
            a2.dispDetails();
            
            System.out.println( "Number of accounts created is "+Account.getCount());
            
            
            
        
                
	}

}
