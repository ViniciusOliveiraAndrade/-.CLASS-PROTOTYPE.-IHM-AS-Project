package br.com.model.vo;

import java.util.List;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;

//@Entity
public class Tema {

//	@Id
//	@GeneratedValue
	private int id;

//	@Column(unique = true)
	private String nome;

//	@OneToMany
//	@JoinColumn(name = "tema_id")
	private List<Item> itens;

	public Tema() {}
	
	public Tema(String nome) {
		super();
		this.nome = nome;
	}



	/*
	 * =====================================> GET and SET  <===================================== 
	 */

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
