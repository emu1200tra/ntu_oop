// Coding by b04902028 Hung Hao Hsiang
// This is calculator problem
// Exception deal with the error problem 
public class UnknownCmdException extends Exception{
	private String Error;
	public UnknownCmdException(String errMessage) {
		this.Error = errMessage;
	}
	public String getMessage() {
		return Error;
	}
}
