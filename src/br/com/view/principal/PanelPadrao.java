package br.com.view.principal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PanelPadrao extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image background;
	private Image animal = null;
	public PanelPadrao() {
		this.background = new ImageIcon(getClass().getResource("local")).getImage();
		setSize(200,200);
		setOpaque(false);
		
	
	}
	
	protected void paintComponent(Graphics g) {
		if(this.animal != null) {
			g.drawImage(this.background, 0, 0, this);
		}
		g.drawImage(this.background, 0, 0, this);
		
		super.paintComponent(g);
	}

	
	
	public void setAnimal(Image animal) {
		this.animal = animal;
	}
	
	public void setMissao() {}
	
	
}
