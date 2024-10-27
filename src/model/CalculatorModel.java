package model;
import java.util.Stack;

public class CalculatorModel implements CalculatorModelInterface{
	private String accu = "";
	private Stack<Double> pile = new Stack<Double>();
	
	public String getAccu() {
		return accu;
	}
	
	public void setAccu(String accu1) {
		accu += accu1;
	}
	
	public Stack<Double> getPile() {
		return pile;
	}
	
	public void setPile(Stack<Double> pile1) {
		pile = pile1;
	}
	
	public void add() {
		pile.add(pile.pop() + pile.pop());
	}

	public void substract() {
		pile.add(pile.pop() - pile.pop());
	}

	public void multiply() {
		pile.add(pile.pop() * pile.pop());
	}

	public void divide() {
		double p1 = pile.pop();
		double p2 = pile.pop();
		if (p2 != 0) {
			pile.add(p1 / p2);
		}
		else {
			pile.add(p2);
			pile.add(p1);
		}
	}

	public void opposite() {
		pile.add(- pile.pop());
	}

	public void push() {
		pile.add(Double.parseDouble(accu));
		this.clear();
	}

	public double pop() {
		double p = pile.pop();
		pile.add(p);
		return p;
	}

	public void drop() {
		pile.pop();
	}

	public void swap() {
		double p1 = pile.pop();
		double p2 = pile.pop();
		pile.add(p1);
		pile.add(p2);
	}
	
	public void clear() {
		accu = "";
	}

	public void clearAll() {
		while(pile.equals(new Stack<Double>())) {
			pile.pop();
		}
	}
}
