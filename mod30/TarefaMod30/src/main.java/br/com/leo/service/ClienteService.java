/**
 * 
 */
package br.com.leo.service;

import br.com.leo.dao.IClienteDAO;
import br.com.leo.domain.Cliente;
import br.com.leo.exceptions.DAOException;
import br.com.leo.exceptions.MaisDeUmRegistroException;
import br.com.leo.service.generic.GenericService;

/**
 * 
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    //private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }

//	@Override
//	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
//		return clienteDAO.cadastrar(cliente);
//	}

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}