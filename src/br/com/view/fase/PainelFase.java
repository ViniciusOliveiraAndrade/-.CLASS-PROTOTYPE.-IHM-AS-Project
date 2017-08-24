package br.com.view.fase;

import javax.swing.JPanel;

public abstract class PainelFase extends JPanel{
		
	private static final long serialVersionUID = 1L;

	public PainelFase() {
		this.setOpaque(false);
		this.setLayout(null);
	}
	
	public abstract void desativarAtivarAudio();
	
	
}
