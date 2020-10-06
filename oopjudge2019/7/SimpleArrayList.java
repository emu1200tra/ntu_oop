// Coding by b04902028 Hung Hao Hsiang
// This is SimpleArrayList problem

public class SimpleArrayList {	
	private int num;	//number of elements in the array
	private Integer array[];	//main array to record all the elements
	public SimpleArrayList() {	//init with default parameters
		this.num = 0;
		this.array = new Integer[1];
	}
	public SimpleArrayList(int init) {	//init with specific parameters if required
		this.num = init;
		this.array = new Integer[init];
		for(int i = 0; i < this.num; i++) {	//init all the elements in the array
			this.array[i] = 0;
		}
	}
	public void add(Integer i) {	//add element into the array
		this.num += 1;
		Integer tmp[] = new Integer[this.num];
		for(int j = 0; j < this.num; j++) {	//create new tmp array to copy all the element including new one
			tmp[j] = 0;
		}
		System.arraycopy(this.array, 0, tmp, 0, this.array.length);	//copy elements in the array
		tmp[this.num-1] = i;	//set new element
		this.array = new Integer[this.num];	//copy tmp array back to original array
		for(int j = 0; j < this.num; j++) {	//init new array
			this.array[j] = 0;
		}
		System.arraycopy(tmp, 0, this.array, 0, tmp.length); //copy array
	}
	public Integer get(int index) {	//get element in the array
		if(index < 0 || index > this.num -1) {	//check the index value is valid or not
			return null;
		}
		else {
			return this.array[index];
		}
	}
	public Integer set(int index, Integer element) {	//set element with specific index in the array
		if(index < 0 || index > this.num - 1) {	//check index is valid or not
			return null;
		}
		else {
			Integer output = this.array[index];
			this.array[index] = element;
			return output;
		}
	}
	public boolean remove(int index) {	//remove element with index in the array
		if(this.array[index] == null) {	//check if null or not
			return false;
		}
		else {	//shrink the array to fit size after removing
			Integer tmp[] = new Integer[this.num-1];
			for(int i = 0; i < index; i++) {
				tmp[i] = this.array[i];
			}
			for(int i = index+1; i < this.array.length; i++) {
				tmp[i-1] = this.array[i];
			}			
			this.array = new Integer[this.num-1];
			System.arraycopy(tmp, 0, this.array, 0, tmp.length);
			this.num -= 1;
			return true;
		}
	}
	public void clear() {	//clear the whole array
		this.num = 0;
		this.array = new Integer[1];
	}
	public int size() {	//output size of array
		return this.num;
	}
	public boolean retainAll(SimpleArrayList l) { //calculation of retaining for two array
		boolean flag = false;
		boolean output = false;
		for(int i = 0; i < this.num; i++) {		//array comparison
			for(int j = 0; j < l.num; j++) {
				if(this.array[i] == l.array[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				this.remove(i);	//remove element
				output = true;
			}
			flag = false;
		}
		return output;
	}
}
