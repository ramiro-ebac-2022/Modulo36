package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.zavala.domain.jpa.ClienteJpa;

/**
 * 
 * @author Ramiro
 *
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}