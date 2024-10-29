package controler;

import java.util.List;

import model.CalculatorModel;
import view.CalculatorGUI;

public class CalculatorControler implements CalculatorControlerInterface{
	private CalculatorModel calcmod;
	private CalculatorGUI calcgui;
	
	public CalculatorControler(CalculatorGUI calcgui1) {
		calcgui = calcgui1;
		calcmod = new CalculatorModel();
		calcmod.setCalccontr(this);
	}

	public void change(String accucu) {
		calcgui.change(calcmod.getAccu());
	}

	public void change(List<Double> stackData) {
	}

	public void boutonChiffreAppuye(String text) {
		calcmod.setAccu(text);
	}

	public void boutonMoinsPressé() {
		calcmod.substract();
	}

	public void boutonPlusPressé() {
		calcmod.add();
	}

}
