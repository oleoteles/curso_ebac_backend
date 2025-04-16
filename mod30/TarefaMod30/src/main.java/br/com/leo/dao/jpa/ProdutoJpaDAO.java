/**
 * 
 */
package br.com.leo.dao.jpa;

import br.com.leo.dao.generic.jpa.GenericJpaDAO;
import br.com.leo.domain.jpa.ProdutoJpa;

/**
 * 
 */
public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
