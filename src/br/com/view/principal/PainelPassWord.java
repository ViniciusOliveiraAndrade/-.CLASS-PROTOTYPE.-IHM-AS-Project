package br.com.view.principal;

import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.JPasswordField;

import br.com.controller.principal.ControllerPainelPassWord;

public class PainelPassWord extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	private ControllerPainelPassWord controller;
	private JPasswordField passwordField;
	
	public PainelPassWord(Observer o) {
		this.setSize(200,26);//200,56
		this.setLocation(390,640);//390,353
		this.setOpaque(false);
		this.controller = new ControllerPainelPassWord(this, o);
		
		this.passwordField = new JPasswordField();
		this.passwordField.setColumns(15);
		this.passwordField.addKeyListener(controller);
		this.add(passwordField);
		this.setVisible(true);
		
	
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}
	
}
