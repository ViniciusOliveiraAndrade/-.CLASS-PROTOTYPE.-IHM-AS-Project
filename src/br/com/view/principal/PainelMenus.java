package br.com.view.principal;

import java.awt.FlowLayout;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import br.com.controller.abstrato.ControllerPainelCentral;
import br.com.controller.principal.ControllerPainelMenus;
import br.com.view.abstrato.PainelCentral;

public class PainelMenus extends PainelCentral{

	private static final long serialVersionUID = 1L;

	private JButton op1; 
	
	private ControllerPainelCentral controller;
	
	public PainelMenus(Observer o) {
		super(o);
		this.setLayout(new FlowLayout());
		this.controller = new ControllerPainelMenus(this, o);
		this.op1 = new JButton(new ImageIcon(getClass().getResource("/1ButtonBlue.png")));
		this.op1.setContentAreaFilled(false);
		this.op1.setBorderPainted(false);
		this.op1.setSize(55,55);
		this.op1.setLocation(868, 612);
		this.op1.addActionListener(controller);
		this.add(this.op1);

	}


	public void desativarAtivarAudio() {

	}

	public JButton getOp1() {
		return op1;
	}
}
