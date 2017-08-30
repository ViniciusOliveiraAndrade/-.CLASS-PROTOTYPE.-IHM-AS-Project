package br.com.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Item {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private String nome;
	
//	private int idImagemItem;
	
	@OneToOne
//	@JoinColumn(name = "ImagemItem_id")
	private ImagemItem imagem = null;
	
	public Item() {}
	
	public Item(String nome, ImagemItem imagen) {
		super();
		this.nome = nome;
		this.imagem = imagen;
	}


	/*
	 * =====================================> GET and SET  <===================================== 
	 */

	public int getId() {
		return id;
	}
	
	public ImagemItem getImagem() {
		return imagem;
	}

	public void setImagem(ImagemItem imagem) {
		this.imagem = imagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
