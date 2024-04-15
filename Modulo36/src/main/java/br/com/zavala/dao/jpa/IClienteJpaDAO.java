package br.com.zavala.dao.jpa;

import br.com.zavala.dao.generic.jpa.IGenericJpaDAO;
import br.com.zavala.domain.jpa.Persistente;

/**
 * 
 * @author Ramiro
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJpaDAO<T, Long>{

}