package br.com.controller.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import br.com.view.principal.PainelPrincipal;

public class ControllerPainelPrincipal implements ActionListener, Observer{
	
	private PainelPrincipal painel;
	
	public ControllerPainelPrincipal(PainelPrincipal painel) {
		this.painel = painel;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.painel.getIoButton()){
			this.painel.desligarLigarTela();
		}
		if(e.getSource() == this.painel.getConfigButton()){
			System.out.println("configButton");
		}
		if(e.getSource() == this.painel.getAudioButton()){
			this.painel.desligarLigarAudio();
		}
	}

	public void update(Observable o, Object arg) {
		
	}
	
}
