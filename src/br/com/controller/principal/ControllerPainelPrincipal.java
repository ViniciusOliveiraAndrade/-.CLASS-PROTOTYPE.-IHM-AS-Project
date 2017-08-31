package br.com.controller.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import br.com.controller.fase.ControllerPainelFase1;
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
			this.painel.criarPainelPAssWord();
			this.painel.repaint();
		}
		if(e.getSource() == this.painel.getAudioButton()){
			this.painel.desligarLigarAudio();
		}
	}

	
	public void update(Observable o, Object arg) {
		System.out.println("\nEntrou do observador\n");
		try {
			if(o.getClass() == ControllerPainelPassWord.class && (boolean)arg){
				System.out.println("PODE ACESSAR");
				this.painel.removerPainelPAssWord();
			}
		} catch (Exception e) {	}
		try {
			if(o.getClass() == ControllerPainelMenus.class) {
				if(1 ==(int)arg){
					this.painel.criarFasse1();
				}
			}
			
		} catch (Exception e) {	}
		try {
			if(o.getClass() == ControllerPainelFase1.class) {
				if((boolean)arg){
					this.painel.criarMenu();
				}
			}
			
		} catch (Exception e) {	}
		
	}

}
