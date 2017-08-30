package br.com.controller.abstrato;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Observable;
import java.util.Observer;

public abstract class ControllerPainelCentral extends Observable implements ActionListener, MouseListener{
	
	public ControllerPainelCentral(Observer o) {
		this.addObserver(o);
	}
	
}
