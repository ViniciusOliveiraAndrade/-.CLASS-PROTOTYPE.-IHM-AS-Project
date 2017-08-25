package br.com.view.principal;


import javax.swing.JPanel;

public abstract class PainelCentral extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public PainelCentral() {
		this.setOpaque(false);
		this.setLayout(null);
		this.setSize(884,559);
		this.setLocation(54, 39);
		
	}
	public abstract void desativarAtivarAudio();
	
}
