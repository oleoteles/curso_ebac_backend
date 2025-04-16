/**
 * 
 */
package br.com.leo.dao.jpa;

import br.com.leo.dao.generic.jpa.GenericJpaDAO;
import br.com.leo.domain.jpa.ClienteJpa;

/**
 * 
 */
public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
