import java.util.Scanner;


public class AccountTest
{ // main method begins execution of Java application
 public static void main( String args[] )
 {
 Account account1 = new Account( 50.00 ); // create Account object
 Account account2 = new Account( -7.53 );

System.out.printf( "account1 balance: $ \n",
		
     account1.getBalance() );
	 System.out.printf( "account2 balance: $ \n\n",
	 account2.getBalance() );
	
	 // create Scanner to obtain input from command window
	 Scanner input = new Scanner( System.in );
	 double depositAmount=0;
	 	 
	 System.out.print( "Enter deposit amount for account1: " ); // prompt
	
	 System.out.printf( "\nadding to account1 balance\n\n",
			 depositAmount);
	 account1.credit(depositAmount ); // add to account1 balance
	
	 // display balances
	 System.out.printf( "account1 balance: $ \n",
	 account1.getBalance() );
	 System.out.printf( "account2 balance: $ \n\n",
	 account2.getBalance() );
	
	 System.out.print( "Enter deposit amount for account2: " ); // prompt
	
	 System.out.printf( "\nadding to account2 balance\n\n",
	 depositAmount );
	 account2.credit( depositAmount ); // add to account2 balance
	
	 // display balances
	 System.out.printf( "account1 balance: $ \n",
	 account1.getBalance() );
	 System.out.printf( "account2 balance: $ \n",
	 account2.getBalance() );
	 } // end main
	
	 } // end class AccountTest
	
	
	
	