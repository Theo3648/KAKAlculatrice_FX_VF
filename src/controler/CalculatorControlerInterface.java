package controler;

import java.util.List;
/**
 * Interface qui va obliger CalculatorControler a au moins avoir ces methodes
 */
public interface CalculatorControlerInterface {
	
	public void change(String accu);
	
	public void change(List<Double> stackData);
	
}
