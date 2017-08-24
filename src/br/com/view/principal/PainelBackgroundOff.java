package br.com.view.principal;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PainelBackgroundOff extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private Image backGround;
	
	public PainelBackgroundOff() {
		this.setOpaque(false);
		this.backGround = new ImageIcon(getClass().getResource("/BackgroundOff.png")).getImage();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backGround, 0, 0, this);
		super.paintComponent(g);
	}
}
