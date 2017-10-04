package br.com.view.fase;

import java.util.Observer;

import br.com.controller.fase.ControllerPainelFase1;
import br.com.view.abstrato.PainelFase;

public class PainelFase1 extends PainelFase{

	private static final long serialVersionUID = 1L;
	private PainelMissao missao; 
	
	private PainelMissao opcao1; 
	private PainelMissao opcao2; 
	private PainelMissao opcao3; 

	private int yOp = 279;
	private int xOp = 280;
	private int space = 25;
	
	private ControllerPainelFase1 controller;
	
	public PainelFase1(Observer o, boolean audio) {
		super(o,audio);
		

		this.missao = new PainelMissao();
		this.missao.setLocation((this.getWidth()/2)- (this.missao.getWidth()/2) , 10);
		this.add(this.missao);
		
		this.opcao1 = new PainelMissao();
		this.opcao1.setLocation(xOp * 0 + space, yOp);
		this.add(this.opcao1);
		
		this.opcao2 = new PainelMissao();
		this.opcao2.setLocation(xOp * 1 + space, yOp);
		this.add(this.opcao2);
		
		this.opcao3 = new PainelMissao();
		this.opcao3.setLocation(xOp * 2 + space, yOp);
		this.add(this.opcao3);
		
		this.controller = new ControllerPainelFase1(o, this);
		this.addMouseListener(controller);
		this.addMouseMotionListener(controller);
		
		
		
	}
	
	public void lugarInicialDasOpcoes(){
		this.opcao1.setLocation(xOp * 0 + space, yOp);

		this.opcao2.setLocation(xOp * 1 + space, yOp);
		
		this.opcao3.setLocation(xOp * 2 + space, yOp);
	}

	public void desativarAtivarAudio() {
		
	}

	public PainelMissao getMissao() {
		return missao;
	}

	public PainelMissao getOpcao1() {
		return opcao1;
	}

	public PainelMissao getOpcao2() {
		return opcao2;
	}

	public PainelMissao getOpcao3() {
		return opcao3;
	}
	
}
