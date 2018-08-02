

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
            int num, i; //num is the number of accounts and i is the iterator
            
            
            System.out.println("Enter the number of accounts to be created: ");
            num = inp.nextInt();
            inp.nextLine(); //removes the newline after getting num
            
            //creating an array of objects
            Account[] acc_details = new Account [num];
            
            
            //Getting the inputs from the user
            for(i=0; i<num; i++)
            {    
                System.out.println("Enter the name: ");
                name = inp.nextLine();
                System.out.println("Enter the balance: ");
                bal = inp.nextDouble();
                acc_details[i] = new Account(name, bal);
                inp.nextLine();
                /**The above command is to remove the newline character after 
                   inp.nextDouble() since it is not consumed by it and this affects 
                   the string input in the following lines*/
            }
            	
            //Displaying the input details
            System.out.println("\nThe account details are: \n");
            for(i=0; i<num; i++)
                acc_details[i].dispDetails();
            
            
            int ac_num; //to get the account number
            double amount; //to store the amount to be withdrawn or deposited
            
            System.out.println("Enter \n1 to withdraw money\n2to deposit\n3.to exit");
            int choice = inp.nextInt(); //to store the user's choice
            switch(choice)
            {
                case 1:
                    //If user wants to withdraw amount
                    System.out.println("Enter the account number: ");
                    ac_num = inp.nextInt(); 
                    System.out.println("Enter the amount to be withdrawn: ");
                    amount = inp.nextDouble();
                    acc_details[0].withdraw(ac_num, acc_details, amount);
                    break;
                    
                case 2:
                    //If user wants to deposit amount
                    System.out.println("Enter the account number: ");
                    ac_num = inp.nextInt();
                    System.out.println("Enter the amount to be deposit: ");
                    amount = inp.nextDouble();
                    acc_details[0].credit(ac_num, acc_details, amount);
                    break;
                    
                    
                case 3:
                    //If user wants to exit the program
                    break;
                
            }
            
            
            
            
            System.out.println( "Number of accounts created is "+Account.getCount());
            
            
            
        
                
	}

}
