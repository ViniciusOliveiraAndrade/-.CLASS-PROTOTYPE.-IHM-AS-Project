package br.com.model.facade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import br.com.model.vo.ImagemItem;
import br.com.model.vo.Item;

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
		this.op1 = new Item(missao);
		this.op2 = new Item(missao);
		this.op3 = new Item(missao);
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
		if(podeContinuar()) {
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
		ArrayList<Item> Aleatorio = new ArrayList<>();
		for (Item i :items) {
			Aleatorio.add(i);
		}
		Collections.shuffle(Aleatorio);
		return Aleatorio.get(0);
	}

	private Item gerarOp(Item primario, Item secundario) {
		if ((secundario.getNome() == primario.getNome())||(secundario.getNome() == this.missao.getNome())) {
			secundario = this.itemAleatorio();
			return gerarOp(primario, secundario);
		}else {
			return secundario;
		}
	}
	
	
	public void gerarOpcoes(){
		int i = r.nextInt(3);
		
		if(i == 0) {
			this.op1 = this.missao;
			
			this.op2 = this.gerarOp(op1,op2);
			this.op3 = this.gerarOp(op2,op3);
		}
		else if(i == 1){
			this.op2 = this.missao;
			
			this.op1 = this.gerarOp(op2,op1);
			this.op3 = this.gerarOp(op1,op3);
		}
		else{
			this.op3 = this.missao;
			
			this.op2 = this.gerarOp(op3,op2);
			this.op1 = this.gerarOp(op2,op1);
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
