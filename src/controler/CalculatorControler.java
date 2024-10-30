package controler;

import java.util.List;

import model.CalculatorModel;
import view.CalculatorGUI;

public class CalculatorControler implements CalculatorControlerInterface{
	private CalculatorModel calcmod;
	private CalculatorGUI calcgui;
	
	public CalculatorModel getCalcMod() {
		return calcmod;
	}
	
	public CalculatorControler(CalculatorGUI calcgui1) {
		calcgui = calcgui1;
		calcmod = new CalculatorModel();
		calcmod.setCalccontr(this);
	}

	public void change(String accu) {
		calcgui.change(accu);
	}

	public void change(List<Double> stackData) {
		calcgui.change(stackData);
	}

	public void boutonChiffreAppuye(String text) {
		calcmod.setAccu(text);
	}

	public void boutonMoinsPresse() {
		calcmod.substract();
	}

	public void boutonPlusPresse() {
		calcmod.add();
	}

	public void boutonFoisPresse() {
		calcmod.multiply();
	}

	public void boutonDiviserPresse() {
		calcmod.divide();
	}

	public void boutonEntréePresse() {
		calcmod.push();	
	}
	
	public void boutonClearPresse() { //Anant
		calcmod.clear();	
	}
	
	public void boutonClearAllPresse() { //Anant
		calcmod.clearAll();	
	}

	public void boutonOpsPresse() {
		calcmod.opposite();
		
	}



}
