package br.com.controller.principal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

import br.com.view.principal.PainelPassWord;

public class ControllerPainelPassWord extends Observable implements KeyListener{

	private PainelPassWord painel;

	private boolean podeAcessar;
	
	private final String  PASSWORD = "APAEADMIN";

	public ControllerPainelPassWord(PainelPassWord painel, Observer o) {
		this.painel = painel;
		this.addObserver(o);
	}

	private void podeAcessar(){
		this.podeAcessar = true;
		this.setChanged();
		this.notifyObservers(podeAcessar);

	}

	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==10) {
			String password = new String(this.painel.getPasswordField().getPassword());
			if (password.equals(PASSWORD)){
				this.podeAcessar();
			}else{
				this.painel.setVisible(false);
			}
		}
	}

	public void keyReleased(KeyEvent e) {}


}
