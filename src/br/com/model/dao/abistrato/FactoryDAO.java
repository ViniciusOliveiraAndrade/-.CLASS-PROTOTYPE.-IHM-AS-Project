package br.com.model.dao.abistrato;

public abstract class FactoryDAO {
	public abstract TemaDAO criarTemaDAO();
	public abstract ItemDAO criarItemDAO();
	public abstract ImagemItemDAO criarImagemItemDAO();
}
