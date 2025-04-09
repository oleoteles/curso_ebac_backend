/**
 * 
 */
package br.com.leo.service;

import br.com.leo.dao.IProdutoDAO;
import br.com.leo.domain.Produto;
import br.com.leo.service.generic.GenericService;

/**
 * 
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
