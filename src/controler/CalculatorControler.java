package controler;

import java.util.List;

import model.CalculatorModel;
import view.CalculatorGUI;

public class CalculatorControler implements CalculatorControlerInterface{

	public void change(String accucu) {
	}

	public void change(List<Double> stackData) {
	}

	public void boutonChiffreAppuye(String text) {
		calcmod.setAccu(text);
	}

}
