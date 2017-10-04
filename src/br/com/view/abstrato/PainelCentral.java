package br.com.view.abstrato;


import java.util.Observer;

import javax.swing.JPanel;

public abstract class PainelCentral extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private boolean audioAtivo = true;
	
	public PainelCentral(Observer o, boolean audioLigado) {
		this.setOpaque(false);
		this.setLayout(null);
		this.setSize(884,559);
		this.setLocation(54, 39);
		this.audioAtivo = audioLigado;
		
	}
	public void desativarAtivarAudio(){
		if (this.audioAtivo){
			this.audioAtivo = false;
		}else {
			this.audioAtivo = true;
		}
	}
	
	public boolean isAudioAtivo() {
		return audioAtivo;
	}
	
}
