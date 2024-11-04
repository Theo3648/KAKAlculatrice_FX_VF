package model;
/**
 * Interface qui va obliger CalculatorModel a au moins avoir ces methodes
 */
public interface CalculatorModelInterface {

	/**
	 * Methode qui somme les deux premiers elements de la pile
	 */
	public void add();
	
	/**
	 * Methode qui permet de soustraire les deux premiers elements de la pile
	 */
	public void substract();
	
	public void multiply();
	
	public void divide();
	
	public void opposite();
	
	public void push();
	
	public double pop();
	
	public void drop();
	
	public void swap();
	
	public void clear();
	
}
