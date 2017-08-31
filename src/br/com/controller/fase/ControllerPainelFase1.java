package br.com.controller.fase;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Observer;

import javax.swing.JOptionPane;

import br.com.controller.abstrato.ControllerPainelCentral;
import br.com.model.facade.Missao;
import br.com.view.fase.PainelFase1;
import br.com.view.fase.PainelMissao;

public class ControllerPainelFase1 extends ControllerPainelCentral implements MouseMotionListener{

	private PainelFase1 fase;

	private PainelMissao opSelecionada;

	private Rectangle areaClik;
	private Rectangle areaOp;

	private Missao missao;

	public ControllerPainelFase1(Observer o,PainelFase1 fase) {
		super(o);
		this.fase = fase;
		this.areaClik = new Rectangle();
		this.areaOp = new Rectangle();
		this.missao = new Missao();
		this.atualizarOpcoes();

	}

	private void voltarParaMenu() {
		setChanged();
		notifyObservers(!this.missao.podeContinuar());
	}

	private void atualizarOpcoes() {
		this.fase.getMissao().adicionarMissao(this.missao.getMissao().getNome());
		this.fase.getOpcao1().adicionarMissao(this.missao.pegarop1().getImagem().getLocal(),this.missao.pegarop1().getNome());
		this.fase.getOpcao2().adicionarMissao(this.missao.pegarop2().getImagem().getLocal(),this.missao.pegarop2().getNome());
		this.fase.getOpcao3().adicionarMissao(this.missao.pegarop3().getImagem().getLocal(),this.missao.pegarop3().getNome());
		this.areaOp.setBounds(1000,1000,1,1);
	}

	private void moverOpcoes(PainelMissao p,int xPassos, int yPassos) {
		p.setLocation( xPassos -120 ,  yPassos - 120);
	}

	public void actionPerformed(ActionEvent e) {}

	public void mouseClicked(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {


		if(areaOp.intersects(this.fase.getMissao().getArea())) {

			if(missao.validarMissao(this.opSelecionada.getMissao())){
				System.out.println("Parabens");
				this.fase.lugarInicialDasOpcoes();
				this.atualizarOpcoes();
			}

			else {
				System.out.println("Errou");
				this.fase.lugarInicialDasOpcoes();
			}
		}
		else {
			System.out.println("Errou");
			this.fase.lugarInicialDasOpcoes();
		}
		if(!this.missao.podeContinuar()) {
			JOptionPane.showMessageDialog(null, "Parabems vc venceu");
			this.voltarParaMenu();
		}

	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mouseDragged(MouseEvent e) {
		areaClik.setBounds(e.getX(), e.getY(), 1, 1);
		areaOp.setBounds(this.fase.getOpcao1().getArea());
		if(areaClik.intersects(areaOp)) {

			this.opSelecionada = this.fase.getOpcao1();
			moverOpcoes(this.fase.getOpcao1(),  e.getX(),e.getY() );

		}else {

			areaOp.setBounds(this.fase.getOpcao2().getArea());
			if (areaClik.intersects(areaOp)) {

				this.opSelecionada = this.fase.getOpcao2();
				moverOpcoes(this.fase.getOpcao2(),  e.getX(),e.getY() );

			}else {

				areaOp.setBounds(this.fase.getOpcao3().getArea());
				if (areaClik.intersects(areaOp)) {
					this.opSelecionada = this.fase.getOpcao3();
					moverOpcoes(this.fase.getOpcao3(),  e.getX(),e.getY() );

				}

			}

		}
	}

	public void mouseMoved(MouseEvent e) {}




}
