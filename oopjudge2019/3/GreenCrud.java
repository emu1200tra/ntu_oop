// Coding by b04902028 Hung Hao Hsiang
// This is GreenCrud problem
public class GreenCrud {
	public static int calPopulation(int initSize, int days){	//return size after n days
		int times = days / 5;																		//calculate how many times the crud increase								
		int tmp1 = initSize, tmp2 = initSize;										
		for (int i = 1; i < times; i++) {												//start to calculate the final amount after n days
			int tmp3 = tmp1+tmp2;																	
			tmp1 = tmp2;
			tmp2 = tmp3;
		}
		return tmp2;
	}
}
