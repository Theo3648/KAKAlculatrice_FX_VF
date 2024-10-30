package model;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;

import controler.CalculatorControler;

public class CalculatorModel implements CalculatorModelInterface{
	private String accu = "";
	private Stack<Double> pile = new Stack<Double>();
	private CalculatorControler calccontr;
	
	public String getAccu() {
		return accu;
	}
	
	public void setAccu(String accu1) {
		try {
			String test = accu + accu1;
			Double.parseDouble(test);
			accu += accu1;
			calccontr.change(accu);
	        }
		catch (NumberFormatException e) {
	        }
		}
	
	public Stack<Double> getPile() {
		return pile;
	}
	
	public void setPile(Stack<Double> pile1) {
		pile = pile1;
	}
	
	public void setCalccontr(CalculatorControler calccontr1) {
		calccontr = calccontr1;
	}
	
	public void add() {
		if (pile.size() >= 2) {
			pile.add(pile.pop() + pile.pop());
			int size = pile.size();
			List<Double> liste = new ArrayList<>();
	        if (size < 4) {
	            liste.addAll(pile);
	        } else {
	            for (int i = size - 4; i < size; i++) {
	                liste.add(pile.get(i));
	            }
	        }
			calccontr.change(liste);
		}
	}

	public void substract() {
		if (pile.size() >= 2) {
			pile.add(pile.pop() - pile.pop());
			int size = pile.size();
			List<Double> liste = new ArrayList<>();
	        if (size < 4) {
	            liste.addAll(pile);
	        } else {
	            for (int i = size - 4; i < size; i++) {
	                liste.add(pile.get(i));
	            }
	        }
			calccontr.change(liste);
		}
	}

	public void multiply() {
		if (pile.size() >= 2) {
			pile.add(pile.pop() * pile.pop());
			int size = pile.size();
			List<Double> liste = new ArrayList<>();
	        if (size < 4) {
	            liste.addAll(pile);
	        } else {
	            for (int i = size - 4; i < size; i++) {
	                liste.add(pile.get(i));
	            }
	        }
			calccontr.change(liste);
		}
	}

	public void divide() {
		if (pile.size() >= 2) {
			double p1 = pile.pop();
			double p2 = pile.pop();
			if (p2 != 0) {
				pile.add(p1 / p2);
			}
			else {
				pile.add(p2);
				pile.add(p1);
			}
			int size = pile.size();
			List<Double> liste = new ArrayList<>();
			if (size < 4) {
				liste.addAll(pile);
			} else {
				for (int i = size - 4; i < size; i++) {
					liste.add(pile.get(i));
				}
			}
			calccontr.change(liste);
		}
	}
		

	public void opposite() {
		if (!accu.isEmpty()) {
			if (accu.charAt(0) == '-') {
				accu = accu.substring(1);
				calccontr.change(accu);
			}
			else {
				accu = '-' + accu;
				calccontr.change(accu);
			}
		}
	}

	public void push() {
		if (!accu.isEmpty()) {
			pile.add(Double.parseDouble(accu));
			this.clear();
			calccontr.change(accu);
			int size = pile.size();
			List<Double> liste = new ArrayList<>();
			if (size < 4) {
				liste.addAll(pile);
			} else {
				for (int i = size - 4; i < size; i++) {
					liste.add(pile.get(i));
				}
			}
			calccontr.change(liste);
		}
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
		calccontr.change("");
	}

	public void clearAll() {
		while(!pile.equals(new Stack<Double>())) {
			pile.pop();
		}
		calccontr.change(new ArrayList<Double>());
	}
}
