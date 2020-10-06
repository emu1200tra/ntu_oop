// Coding by b04902028 Hung Hao Hsiang
// This is ATM problem
// Exception dealing with error 
public class ATM_Exception extends Exception{
	public enum ExceptionTYPE {	//enum for every exception type
		BALANCE_NOT_ENOUGH,
		AMOUNT_INVALID
	}
	private ExceptionTYPE excptionCondition;
	public ATM_Exception(ExceptionTYPE a) { //init with condition
		excptionCondition = a;
	}
	public String getMessage() {	//get error message
		switch (excptionCondition){
		case BALANCE_NOT_ENOUGH:
			return "BALANCE_NOT_ENOUGH";
		default:
			return "AMOUNT_INVALID";
		}
	}
	
}
