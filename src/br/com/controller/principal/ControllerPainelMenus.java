package br.com.controller.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Observer;

import br.com.controller.abstrato.ControllerPainelCentral;
import br.com.view.principal.PainelMenus;

public class ControllerPainelMenus extends ControllerPainelCentral implements ActionListener{
	
	private PainelMenus painel;
	
	private int fase = 0;
	
	public ControllerPainelMenus(PainelMenus painel,Observer o) {
		super(o);
		this.painel = painel;
	}

	private void mudarEstado(int fase) {
		this.fase = fase;
		setChanged();
		notifyObservers(fase);
	}
	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.painel.getOp1()) {
			mudarEstado(1);
		}
	}

	public int getFase() {
		return fase;
	}

	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
