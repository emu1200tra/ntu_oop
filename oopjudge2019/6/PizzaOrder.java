// Coding by b04902028 Hung Hao Hsiang
// This is PizzaOrder problem
public class PizzaOrder {
	private int num;														//record how many pizzas ordered
	private Pizza[] pizza_order = new Pizza[3];	//by default, set the max number of pizzas to 3
	public PizzaOrder() {												//init the number of pizzas to 0
		this.num = 0;
	}
	public boolean setNumberPizzas(int numberPizzas) { //if required, set the number of pizzas to specific number 
		if(numberPizzas < 1 || numberPizzas > 3) {	//check the number of pizzas is valid or not
			return false;
		}
		else {
			this.num = numberPizzas;
			return true;
		}
	}
	public void setPizza1(Pizza a) {	//set pizza number 1 with specific pizza input
		this.pizza_order[0] = a;
	}
	public void setPizza2(Pizza b) {	//set pizza number 2 with specific pizza input
		this.pizza_order[1] = b;
	}
	public void setPizza3(Pizza c) {	//set pizza number 3 with specific pizza input
		this.pizza_order[2] = c;
	}
	public float calcTotal() {	//calculate total cost of all the pizzas
		float cost = 0;
		for(int i = 0 ; i < num ; i++) {
			cost = cost + this.pizza_order[i].calcCost();
		}
		return cost;
	}
}
