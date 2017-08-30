package br.com.model.dao;

import java.util.List;

import br.com.model.vo.Item;
import br.com.model.vo.Tema;

public interface InterfaceDAO {
	
	
	public abstract void removerTema(int temaID);
	
	public abstract void removerItem(int temaID);
	
	public abstract void removerImagemItem(int temaID);

	public default void removerTemaCompleto(Tema tema){
		List<Item> il = tema.getItens();
		for(int i = 0; i < il.size(); i++) {
			removerImagemItem(il.get(i).getImagem().getId());
			removerItem(il.get(i).getId());
		}
		removerTema(tema.getId());
		
	}

}
