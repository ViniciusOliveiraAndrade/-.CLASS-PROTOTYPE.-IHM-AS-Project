package br.com.model.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import br.com.model.vo.ImagemItem;
import br.com.model.vo.Item;

@SuppressWarnings("unchecked")
public class Missao {


	private ArrayList<Item> items;

	private ArrayList<Item> itemsPassados;

	private Item missao;
	private Item op1;
	private Item op2;
	private Item op3;

	private Random r;
	
	private int q = 0;

	public Missao() {
		this.criarItems();
		this.itemsPassados = new ArrayList<>();
		Collections.shuffle(this.items);
		this.missao = this.items.get(q);
		this.q++;
		
		r = new Random();
		
		this.gerarOpcoes();	
	}

	private void criarItems(){
		this.items = new ArrayList<>();
		this.items.add(new Item("Monitor",new ImagemItem("/Monitor.png")));
		this.items.add(new Item("Mouse",new ImagemItem("/Mouse.png")));
		this.items.add(new Item("Teclado",new ImagemItem("/Teclado.png")));
		this.items.add(new Item("Gabinete",new ImagemItem("/Gabinete.png")));
		this.items.add(new Item("Notebook",new ImagemItem("/Notebook.png")));
	}
		
	public boolean validarMissao(String hit ) {
		if (this.missao.getNome().equals(hit)){
			trocarMissao();
			return true;
		}else {
			return false;
		}
	}
	
	private boolean trocarMissao(){
		if(this.q < items.size()) {
			this.itemsPassados.add(missao);
			this.missao =  this.items.get(q);
			this.q++;
			this.gerarOpcoes();
			return true;
		}else {
			this.itemsPassados.add(missao);
			return false;
		}
	}
	
	public boolean podeContinuar(){
		if (this.q < this.items.size()){
			return true;
		}else {
			return false;
		}
	}

	private Item itemAleatorio() {
		ArrayList<Item> Aleatorio = (ArrayList<Item>)items.clone();
		Collections.shuffle(Aleatorio);
		return Aleatorio.get(0);
	}

	private Item gerarOp(Item primario, Item secundario) {
		if (secundario == primario) {
			secundario = this.itemAleatorio();
			return gerarOp(primario, secundario);
			
		}else {
			return secundario;
		}
	}
	
	public void gerarOpcoes(){
		int i = r.nextInt(3);
		switch (i) {
		
		case 0:{
			this.op1 = this.missao;
			
			this.op2 = this.gerarOp(op1,op2);
			this.op3 = this.gerarOp(op2,op3);
			break;
			}
		case 1:{
			this.op2 = this.missao;
			
			this.op1 = this.gerarOp(op2,op1);
			this.op3 = this.gerarOp(op1,op3);
			break;
			}
		case 3:{
			this.op3 = this.missao;
			
			this.op2 = this.gerarOp(op3,op2);
			this.op1 = this.gerarOp(op2,op1);
			
			break;
			}
		}
	}
	

	public Item getMissao() {
		return missao;
	}

	public Item pegarop1() {
		return op1;
	}
	
	public Item pegarop2() {
		return op2;
	}
	
	public Item pegarop3() {
		return op3;
	}

}
