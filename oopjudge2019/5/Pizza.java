// Coding by b04902028 Hung Hao Hsiang
// This is Pizza problem
public class Pizza {
	private String size;				//pizza size
	private int cheese;					//amount of cheese
	private int pepperoni;			//amount of pepperoni
	private int ham; 						//amount of ham
	public Pizza() {						//init pizza with default parameters
		this.size = "small";
		this.cheese = 1;
		this.pepperoni = 1;
		this.ham = 1;
	}
	public Pizza(String pizza_size, int cheese_amount, int pepperoni_amount, int ham_amount) {
		//init pizza with specific parameters
		this.size = pizza_size;
		this.cheese = cheese_amount;
		this.pepperoni = pepperoni_amount;
		this.ham = ham_amount;
	}
	public void setSize(String set_size) {
		//set the pizza size
		this.size = set_size;
	}
	public void setNumberOfCheese(int set_cheese) {
		//set amount of cheese
		this.cheese = set_cheese;
	}
	public void setNumberOfPepperoni(int set_pepp) {
		//set amount of pepperoni
		this.pepperoni = set_pepp;
	}
	public void setNumberOfHam(int set_ham) {
		//set amount of ham
		this.ham = set_ham;
	}
	public String getSize() {
		//get the size of pizza
		return this.size;
	}
	public int getNumberOfCheese() {
		//get the amount of cheese required
		return this.cheese;
	}
	public int getNumberOfPepperoni() {
		//get the amount of pepperoni required
		return this.pepperoni;
	}
	public int getNumberOfHam() {
		//get the amount of hma required
		return this.ham;
	}
	public float calcCost() {
		//calculate the total cost of the whole pizza required
		float price = 0;
		if (size == "small") {
			price = 10 + this.cheese * 2 + this.pepperoni * 2 + this.ham * 2; 
		}
		else if (size == "medium") {
			price = 12 + this.cheese * 2 + this.pepperoni * 2 + this.ham * 2;
		}
		else {
			price = 14 + this.cheese * 2 + this.pepperoni * 2 + this.ham * 2;
		}
		return price;
	}
	public String toString() {
		//output information of the pizza with string
		return "size = " + this.size + ", numOfCheese = " + ("" + this.cheese) + ", numOfPepperoni = " + ("" + this.pepperoni) + ", numOfHam = " + ("" + this.ham);
	}
	public boolean equals(Pizza cmp) {
		//check two pizzas are equal or not
		if (cmp.size == this.size && cmp.cheese == this.cheese && cmp.pepperoni == this.pepperoni && cmp.ham == this.ham) {
			return true;
		}
		else {
			return false;
		}
	}
}
