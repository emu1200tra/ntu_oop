// Coding by b04902028 Hung Hao Hsiang
// This is Calculator problem

import java.text.DecimalFormat;

public class SimpleCalculator {
	private double result;	//result of calculation
	private int count;			//count for operating times
	private String[] cmd;		//cmd buffer
	private boolean flag;		//flag for checking
	public SimpleCalculator() {	//init arguments
		this.result = 0.0;
		this.count = 0;
		this.flag = false;
	}
	public void calResult(String cmd) throws UnknownCmdException{
		//main calculating part. it may occur exception
		this.cmd = cmd.split(" ");
		//exception dealing
		if(this.cmd.length != 2) {
			throw new UnknownCmdException("Please enter 1 operator and 1 value separated by 1 space");
		}
		else if((!this.cmd[0].equals("+") && !this.cmd[0].equals("-") && !this.cmd[0].equals("*") && !this.cmd[0].equals("/")) && check_number(this.cmd[1])) {
			throw new UnknownCmdException(this.cmd[0]+" is an unknown operator and "+this.cmd[1]+" is an unknown value");
		}
		else if(!this.cmd[0].equals("+") && !this.cmd[0].equals("-") && !this.cmd[0].equals("*") && !this.cmd[0].equals("/")) {
			throw new  UnknownCmdException(this.cmd[0]+" is an unknown operator");
		}
		else if(check_number(this.cmd[1])) {
			throw new UnknownCmdException(this.cmd[1]+" is an unknown value");
		}
		else if(this.cmd[0].equals("/") && Math.signum(Double.parseDouble(this.cmd[1])) == 0) {
			throw new UnknownCmdException("Can not divide by 0");
		}
		else {
			//main calculating part
			if(this.cmd[0].equals("+")) {
				this.result = this.result + Double.parseDouble(this.cmd[1]);
			}
			else if(this.cmd[0].equals("-")) {
				this.result = this.result - Double.parseDouble(this.cmd[1]);
			}
			else if(this.cmd[0].equals("*")) {
				this.result = this.result * Double.parseDouble(this.cmd[1]);
			}
			else if(this.cmd[0].equals("/")) {
				this.result = this.result / Double.parseDouble(this.cmd[1]);
			}
			this.count ++;
		}		
	}
	public String getMsg() { //dealing calculating message
		String format = "#0.00";
		DecimalFormat df = new DecimalFormat(format);
		String output_result = df.format(this.result);
		if(this.count == 0) {
			return "Calculator is on. Result = "+output_result;
		}
		else if(this.count == 1) {
			String input_value = df.format(Double.parseDouble(this.cmd[1]));
			return "Result "+this.cmd[0]+" "+input_value+" = "+output_result+". New result = "+output_result;
		}
		else if(this.flag) {
			return "Final result = "+output_result;
		}
		else {
			String input_value = df.format(Double.parseDouble(this.cmd[1]));
			return "Result "+this.cmd[0]+" "+input_value+" = "+output_result+". Updated result = "+output_result;
		}
	}
	public boolean endCalc(String cmd) { //end the calculating process
		if (cmd.equals("R") || cmd.equals("r")) {
			this.flag = true;
			return true;
		}
		else {
			return false;
		}
	}
	boolean check_number(String cmd) {	//check the input is valid or not
		for(int i = 0; i < cmd.length(); i++) {
			if((cmd.charAt(i) < '0' || cmd.charAt(i) > '9') && cmd.charAt(i)!='.') {
				return true;
			}
		}
		return false;
	}
}
