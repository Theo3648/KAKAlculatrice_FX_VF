package model;
/**
 * Interface qui va obliger CalculatorModel a au moins avoir ces methodes
 */
public interface CalculatorModelInterface {

	public void add();
	
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
