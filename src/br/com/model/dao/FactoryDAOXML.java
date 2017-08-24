package br.com.model.dao;

import br.com.model.dao.abistrato.FactoryDAO;
import br.com.model.dao.abistrato.TemaDAO;
import br.com.model.dao.abistrato.ItemDAO;
import br.com.model.dao.abistrato.ImagemItemDAO;



public class FactoryDAOXML extends FactoryDAO {

	public TemaDAO criarTemaDAO() {
		return new TemaDAOXML();
	}

	public ItemDAO criarItemDAO() {
		return new ItemDAOXML();
	}

	public ImagemItemDAO criarImagemItemDAO() {
		return new ImagemItemDAOXML();
	}

	
	
	
}
