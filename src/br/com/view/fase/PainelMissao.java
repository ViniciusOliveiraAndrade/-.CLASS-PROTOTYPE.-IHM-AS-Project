package br.com.view.fase;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

public class PainelMissao extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private Image background;
	
	private JLabel labelMissao;
	
	private String missao;
	
	public PainelMissao() {
		this.iniciarPainel();
	}
	
	private void iniciarPainel() {
		this.background = new ImageIcon(getClass().getResource("/Grade.png")).getImage();
		this.setSize(268,268);
		this.setOpaque(false);
		this.setLayout(new BorderLayout(0, 0));
	}
	
	public void adicionarMissao(String nome){
		this.labelMissao = new JLabel ("  "+nome);
		this.labelMissao.setFont(new Font("Dialog", Font.BOLD, 32));
		this.labelMissao.setForeground(Color.black);
		this.add(labelMissao);
		
		this.missao = nome;
	}
	
	public void adicionarMissao(String imagem,String nome) {
		this.labelMissao = new JLabel (new ImageIcon(this.getClass().getResource(imagem)));
		this.labelMissao.setForeground(Color.black);
		this.add(labelMissao);
		
		this.missao = nome;
	} 
	
	
	protected void paintComponent(Graphics g) {
		g.drawImage(this.background, 0, 0, this);
		super.paintComponent(g);
	}

	public String getMissao() {
		return missao;
	}
	
}
