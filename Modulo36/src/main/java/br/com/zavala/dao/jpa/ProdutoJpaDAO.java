package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.zavala.domain.jpa.ProdutoJpa;

/**
 * 
 * @author Ramiro
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
