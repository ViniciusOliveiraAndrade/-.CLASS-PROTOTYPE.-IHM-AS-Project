package br.com.model.dao.hibernate;

import java.util.ArrayList;

import br.com.model.dao.abistrato.ImagemItemDAO;
import br.com.model.vo.ImagemItem;
import br.com.model.vo.Tema;

@SuppressWarnings("static-access")
public class ImagemItemDAOHiber extends ImagemItemDAO{

	public void inserir(Tema t) {
	}

	public void atualizar() {
	}

	public ImagemItem getById(int id) {
		return ConnectionHiber.getConnectionHiber().getEntityManager().find(ImagemItem.class, id);
	}

	public void removeById(int id) {
	}

	public ArrayList<ImagemItem> listar() {
		return null;
	}

	@Override
	public void inserir() {
		// TODO Auto-generated method stub
		
	}

}
