package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.zavala.domain.jpa.ClienteJpa;

/**
 * 
 * @author Ramiro
 *
 */
public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
