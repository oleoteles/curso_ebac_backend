package service;

import java.util.ArrayList;
import java.util.List;

import mocks.IContratoDao;

public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;
	private List<String> clientesNomes = new ArrayList<>();

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

	@Override
	public String buscar(String nome) {
		
		if (this.clientesNomes.contains(nome)) {
            contratoDao.buscar(nome);
            return "Sucesso";
        }
        return "Cliente não encontrado. Tente novamente";
	}

	@Override
	public boolean excluir(String nome) {
        this.clientesNomes.add("Leonardo"); 

        if (this.clientesNomes.contains(nome)) {
            this.clientesNomes.remove(nome);
        }
        return this.clientesNomes.contains(nome);
    }

	@Override
	public String atualizar(Integer nome) {

        contratoDao.atualizar(String.valueOf(nome));
        throw new NumberFormatException("Não inserir número. Procure o responsável para a atualização do contrato");

    }

}
