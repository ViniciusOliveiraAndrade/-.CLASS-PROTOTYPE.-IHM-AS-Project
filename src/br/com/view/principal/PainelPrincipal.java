package br.com.view.principal;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.controller.principal.ControllerPainelPrincipal;
import br.com.view.abstrato.PainelCentral;
import br.com.view.fase.PainelFase1;

import javax.swing.ImageIcon;


public class PainelPrincipal extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private JButton ioButton;
	private JButton configButton;
	private JButton audioButton;
	
	private PainelCentral painelCentral;
	
	private PainelBackgroundOff painelBackgroundOff;
	
	private PainelPassWord painelPassWord;
	
	private Image backGround;
	
	private ControllerPainelPrincipal controller;
	
	private boolean telaLigada = true;
	private boolean audioLigado = true; 
	
	public PainelPrincipal(Dimension d) {
		this.setSize(d);
		this.setLayout(null);
		this.setOpaque(false);
		
		this.controller = new ControllerPainelPrincipal(this);
		
		this.backGround = new ImageIcon(getClass().getResource("/BackGround.png")).getImage();
		
		this.ioButton = new JButton(new ImageIcon(getClass().getResource("/IOButtonGreen.png")));
		this.ioButton.setContentAreaFilled(false);
		this.ioButton.setBorderPainted(false);
		this.ioButton.setSize(55,55);
		this.ioButton.setLocation(868, 612);
		this.ioButton.addActionListener(controller);
		this.add(this.ioButton);
		
		this.configButton = new JButton(new ImageIcon(getClass().getResource("/ConfigButtonBlack.png")));
		this.configButton.setContentAreaFilled(false);
		this.configButton.setBorderPainted(false);
		this.configButton.setSize(45,45);
		this.configButton.setLocation(60, 617);
		this.configButton.addActionListener(controller);
		this.add(this.configButton);
		
		this.audioButton = new JButton(new ImageIcon(getClass().getResource("/SoundButtonBlack.png")));
		this.audioButton.setContentAreaFilled(false);
		this.audioButton.setBorderPainted(false);
		this.audioButton.setSize(45,45);
		this.audioButton.setLocation(115, 617);
		this.audioButton.addActionListener(controller);
		this.add(this.audioButton);
		
		this.painelBackgroundOff = new PainelBackgroundOff();
		this.painelBackgroundOff.setSize(884,559);
		this.painelBackgroundOff.setLocation(54, 39);
		this.painelBackgroundOff.setVisible(false);
		this.add(painelBackgroundOff);
		
		this.painelCentral = new PainelMenus(controller);
		this.add(painelCentral);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(backGround, 0, 0, this);
		super.paintComponent(g);
	}
	
	//Desligar / Ligar
	
	public void desligarLigarTela(){
		if(telaLigada){
			
			this.painelCentral.setVisible(false);
			this.painelBackgroundOff.setVisible(true);
			this.ioButton.setIcon(new ImageIcon(getClass().getResource("/IOButtonBlack.png")));
			this.telaLigada = false;
			
		}else {
			
			this.painelBackgroundOff.setVisible(false);
			this.painelCentral.setVisible(true);
			this.ioButton.setIcon(new ImageIcon(getClass().getResource("/IOButtonGreen.png")));
			this.telaLigada = true;
		}
	}
	
	//Criar PainelCentral
	private void criarPainelCentral( PainelCentral pc ){
		this.painelCentral.setVisible(false);
		this.remove(this.painelCentral);
		this.painelCentral = pc;
		this.add(painelCentral);
	}
	
	//Fases
	//Fase1
	public void criarFasse1(){
		this.criarPainelCentral(new PainelFase1(controller));
	}
	
	
	
	
	//Password
	public void criarPainelPAssWord() {
		if(!this.isTelaLigada()) {
			this.painelPassWord = new PainelPassWord(this.controller);
			this.add(this.painelPassWord);
		}
	}

	public void removerPainelPAssWord() {
		this.painelPassWord.setVisible(false);
		this.remove(this.painelPassWord);
		this.painelPassWord = null;
		this.repaint();///Verificar se serve
	}
	
	
	//Audio
	public void desligarLigarAudio(){
		if(audioLigado){
			this.audioLigado = false;
			this.painelCentral.desativarAtivarAudio();
			this.audioButton.setIcon(new ImageIcon(getClass().getResource("/MuteButtonBlack.png")));
			
		}else {
			this.audioLigado = true;
			this.painelCentral.desativarAtivarAudio();
			this.audioButton.setIcon(new ImageIcon(getClass().getResource("/SoundButtonBlack.png")));
		}
	}
	
	
	
	
	
	public JButton getIoButton() {
		return ioButton;
	}

	public JButton getConfigButton() {
		return configButton;
	}

	public JButton getAudioButton() {
		return audioButton;
	}

	public boolean isTelaLigada() {
		return telaLigada;
	}
	
	
}
