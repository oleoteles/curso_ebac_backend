/**
 * 
 */
package br.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dao.IProdutoDao;
import br.com.dao.ProdutoDao;
import br.com.domain.Produto;

/**
 * 
 */
public class ProdutoTest {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setNome("Video-game");
		produto.setQuantidade(12);
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}
}	
