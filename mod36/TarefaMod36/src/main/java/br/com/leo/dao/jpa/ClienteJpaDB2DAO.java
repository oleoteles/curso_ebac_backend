/**
 * 
 */
package br.com.leo.dao.jpa;

import br.com.leo.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.leo.domain.jpa.ClienteJpa;

/**
 * 
 */
public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
