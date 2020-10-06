// Coding by b04902028 Hung Hao Hsiang
// This is ATM problem
// Account object to record details of an account
class Account {
	private int balance;	//balance in the account
	public Account(int balance) {	//init with balance value
		setBalance(balance);
	}
	public int getBalance() {	//get the blalance now
		return balance;
	}
	public void setBalance(int balance) {	//set balance with specific value
		this.balance = balance;
	}
}