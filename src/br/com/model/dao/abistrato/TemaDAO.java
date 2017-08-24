package br.com.model.dao.abistrato;

import java.util.ArrayList;

import br.com.model.vo.Tema;

public abstract class TemaDAO {
	public abstract void inserir();
    public abstract void atualizar();
    public abstract Tema getById(int id);
    public abstract void removeById(int id);
    public abstract ArrayList<Tema> listar();
}
