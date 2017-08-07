package br.com.model.vo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Item {

	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private String nome;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ImagemItem_id")
	private ImagemItem imagen;

	public Item() {}
	
	public Item(String nome, ImagemItem imagen) {
		super();
		this.nome = nome;
		this.imagen = imagen;
	}


	/*
	 * =====================================> GET and SET  <===================================== 
	 */

	public int getId() {
		return id;
	}
	
	public ImagemItem getImagen() {
		return imagen;
	}

	public void setImagen(ImagemItem imagen) {
		this.imagen = imagen;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
