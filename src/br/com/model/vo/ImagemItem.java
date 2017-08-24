package br.com.model.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ImagemItem {
	
	@Id
	@GeneratedValue
	private int id;

	@Column(unique = true)
	private String local;
	
	public ImagemItem() {}
	
	public ImagemItem(String local) {
		super();
		this.local = local;
	}

	/*
	 * =====================================> GET and SET  <===================================== 
	 */

	public int getId() {
		return id;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

}
