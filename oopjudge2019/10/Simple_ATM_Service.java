// Coding by b04902028 Hung Hao Hsiang
// This is ATM problem
// Main ATM service process implementing from ATM_Service
public class Simple_ATM_Service implements ATM_Service {
	public boolean checkBalance(Account account, int money) throws ATM_Exception{	//check balance is enough or not
		if(account.getBalance() < money) {
			throw new ATM_Exception(ATM_Exception.ExceptionTYPE.BALANCE_NOT_ENOUGH);
		}
		else {
			return true;
		}
	}
	public boolean isValidAmount(int money) throws ATM_Exception{	//check withdraw amount is valid or not
		if(money % 1000 != 0) {
			throw new ATM_Exception(ATM_Exception.ExceptionTYPE.AMOUNT_INVALID);
		}
		else {
			return true;
		}
	}
	public void withdraw(Account account, int money) {	//withdraw money. may occur exception
		try {
			if(this.checkBalance(account, money) && this.isValidAmount(money)) {
				account.setBalance(account.getBalance()-money);
			}
		} 
		catch(ATM_Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("updated balance : "+String.valueOf(account.getBalance()));
	}
	
	
}
