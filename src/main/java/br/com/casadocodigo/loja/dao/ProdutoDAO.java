package br.com.casadocodigo.loja.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.com.casadocodigo.loja.models.Produtos;

@Repository
@Component
public class ProdutoDAO {
	
	@PersistenceContext
	private EntityManager manager;

	public void gravar(Produtos produto){
		manager.persist(produto);
				
	}
}
