/**
 * 
 */
package services;

import dao.IClienteDAO;
import domain.Cliente;

/**
 * 
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

}
