/*
 * A Test Driver for the Account class.
 */
public class TestAccount {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account a1 = new Account(201511273, 4000);
      System.out.println(a1);  // toString()
 
      // Test Setters and Getters
      a1.setBalance(2012);

      
      System.out.println(a1);  // run toString() to inspect the modified instance
      System.out.println("Balance is: $" + a1.getBalance());
      System.out.println("Account Number is: " + a1.getAccountNumber());
 
      // Test set, credit, debit
      a1.setBalance(2988);
      a1.debit(488);
      a1.credit(500);
      System.out.println(a1);  // toString()
   }
}

