package view;

import java.util.List;
/**
 * Interface qui va obliger CalculatorGUI a au moins avoir ces methodes
 */
public interface CalculatorGUIInterface {
	
	public void affiche();
	
	public void change(String accu);
	
	public void change(List<Double> stackData);

}
