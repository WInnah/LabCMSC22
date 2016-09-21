public class Account {
	private int accountNumber;
	private double balance;

	public Account(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public Account(int accountNumber){
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber(){
		return accountNumber;
	}

	public double getBalance(){
		return balance;
	}

	public void setBalance(double balance){
		this.balance = balance;
	}

	public void credit(double amount){
		this.balance += amount;
	}

	public void debit(double amount){
		if (balance >= amount){
			balance -= amount;
		}else{
			System.out.println("amount withdrawn exceeds the current balance!");
		}
	}

	public String toString(){
		 return String.format("A/C no: %d, Balance = $%.02f", accountNumber, balance);
	}
}