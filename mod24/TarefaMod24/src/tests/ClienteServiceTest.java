package tests;

import java.lang.module.FindException;

import org.junit.Assert;
import org.junit.Test;

import service.ClienteService;
import mocks.ClienteDao;
import mocks.ClienteDaoMock;
import mocks.IClienteDao;

public class ClienteServiceTest {

	@Test
    public void salvarTest() {
        IClienteDao mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDao mockDao = new ClienteDao();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = FindException.class)
    public void buscar() {
        IClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retorno = service.buscar(3);
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = FindException.class)
    public void excluir() {
        IClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retorno = service.excluir(3);
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void salvar() {
        IClienteDao clienteDao = new ClienteDao();
        ClienteService service = new ClienteService(clienteDao);
        String retorno = service.atualizar(3);
        Assert.assertEquals("Sucesso", retorno);
    }
}
