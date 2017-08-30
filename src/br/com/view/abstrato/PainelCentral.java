package br.com.view.abstrato;


import java.util.Observer;

import javax.swing.JPanel;

public abstract class PainelCentral extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private boolean audioAtivo = false;
	
	public PainelCentral(Observer o) {
		this.setOpaque(false);
		this.setLayout(null);
		this.setSize(884,559);
		this.setLocation(54, 39);
		
	}
	public abstract void desativarAtivarAudio();
	
	
	public boolean isAudioAtivo() {
		return audioAtivo;
	}
	public void setAudioAtivo(boolean audioAtivo) {
		this.audioAtivo = audioAtivo;
	}
	
	
}
