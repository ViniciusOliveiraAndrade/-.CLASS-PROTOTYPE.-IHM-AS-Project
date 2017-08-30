package br.com.model.dao;

import br.com.model.dao.hibernate.ImagemItemDAOHiber;
import br.com.model.dao.hibernate.ItemDAOHiber;
import br.com.model.dao.hibernate.TemaDAOHiber;
import br.com.model.vo.ImagemItem;
import br.com.model.vo.Item;
import br.com.model.vo.Tema;

public class DAO implements InterfaceDAO{
	
	private static TemaDAOHiber temaDAO;
	private static ItemDAOHiber itemDAO;
	private static ImagemItemDAOHiber imagemDAO;
	
	
	public static void cadastrarTema(Tema s){
		temaDAO = new TemaDAOHiber();
		@SuppressWarnings("unused")
		Tema t = temaDAO.getByName(s.getNome());
		if (t==null) {
			temaDAO.inserir(s);
		}
	}
	
	public static Tema getTemaById (int id) {
		temaDAO = new TemaDAOHiber();
		return temaDAO.getById(id);
	}
	
	public static Item getItemById (int id) {
		itemDAO = new ItemDAOHiber();
		return itemDAO.getById(id);
	}
	
	public static ImagemItem getImageById (int id){
		imagemDAO = new ImagemItemDAOHiber();
		return imagemDAO.getById(id);
	}

	@Override
	public void removerTema(int temaID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerItem(int temaID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerImagemItem(int temaID) {
		// TODO Auto-generated method stub
		
	}
	
	

}
