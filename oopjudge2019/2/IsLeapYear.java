// Coding by b04902028 Hung Hao Hsiang
// This is IsLeapYear problem
public class IsLeapYear {
	public static boolean determine(int year) { 		// return true if it is leap year; otherwise return false
		if (year % 400 == 0) {												// if can be divided by 400, then it is leap year
			return true;
		}
		else if (year % 4 == 0 && year % 100 != 0) {	// if can be divided by 4 but can't be divided by 100, then it is leap year
			return true;
		}
		else {																				// otherwise, it is not leap year
			return false;
		}
	}
}
