
public class Account
 {
private double balance;

// constructor
 public Account( double initialBalance )
 {
 // validate that initialBalance is greater than 0.0;
 // if it is not, balance is initialized to the default value 0.0
 if ( initialBalance > 0.0 )
 balance = initialBalance;
 }

 public void credit( double amount )
  {
  balance = balance + amount; // add amount to balance
  } // end method credit
 
  // return the account balance
  public double getBalance()
  {
  return balance; // gives the value of balance to the calling method
  } // end method getBalance
 
 }