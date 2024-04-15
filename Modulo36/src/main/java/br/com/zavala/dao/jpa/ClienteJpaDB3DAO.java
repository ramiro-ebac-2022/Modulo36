package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.zavala.domain.jpa.ClienteJpa2;

/**
 * 
 * @author Ramiro
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}