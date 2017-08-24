package br.com.model.dao.abistrato;

import java.util.ArrayList;

import br.com.model.vo.Item;

public abstract class ItemDAO {
	
	public abstract void inserir();
    public abstract void atualizar();
    public abstract Item getById(int id);
    public abstract void removeById(int id);
    public abstract ArrayList<Item> listar();
	
}
