/**
 * 
 */
package test;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.leo.dao.IProdutoDAO;
import br.com.leo.domain.Produto;
import br.com.leo.exceptions.DAOException;
import br.com.leo.exceptions.MaisDeUmRegistroException;
import br.com.leo.exceptions.TableException;
import br.com.leo.exceptions.TipoChaveNaoEncontradaException;
import br.com.leo.service.IProdutoService;
import br.com.leo.service.ProdutoService;
import dao.ProdutoDaoMock;

/**
 * 
 */
public class ProdutoServiceTest {

    private IProdutoService produtoService;

    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDaoMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
    }

    @Test
    public void pesquisar() throws DAOException, MaisDeUmRegistroException, TableException {
        Produto produtor = this.produtoService.consultar(produto.getCodigo());
        Assert.assertNotNull(produtor);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("Leonardo Teles");
        produtoService.alterar(produto);

        Assert.assertEquals("Leonardo Teles", produto.getNome());
    }
}
