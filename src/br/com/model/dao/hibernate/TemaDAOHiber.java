package br.com.model.dao.hibernate;

import java.util.ArrayList;

import br.com.model.dao.abistrato.TemaDAO;
import br.com.model.vo.Tema;

@SuppressWarnings("static-access")
public class TemaDAOHiber extends TemaDAO{

	public void inserir() {
		
	}

	public void atualizar() {
		
	}

	public Tema getById(int id) {
		return ConnectionHiber.getConnectionHiber().getEntityManager().find(Tema.class, id);
	}

	public void removeById(int id) {
		
	}

	public ArrayList<Tema> listar() {
		return null;
	}

}
