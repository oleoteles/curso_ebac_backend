/**
 * 
 */
package dao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import domain.Cliente;
import exceptions.TipoChaveNaoEncontradaException;
import services.ClienteService;
import services.IClienteService;

/**
 * 
 */
public class ClienteServiceTest {
	
private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(12312312312L);
		cliente.setNome("Leonardo");
		cliente.setCidade("Recife");
		cliente.setEnd("End");
		cliente.setEstado("PE");
		cliente.setNumero(10);
		cliente.setTel(1199999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Leonardo Teles");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Leonardo Teles", cliente.getNome());
	}
}
