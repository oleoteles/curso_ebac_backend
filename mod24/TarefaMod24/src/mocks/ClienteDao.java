package mocks;

public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
        //return "Sucesso";
    }
    
    @Override
    public void buscar() {

    }

    @Override
    public void excluir() {

    }

    @Override
    public void atualizar() {

    }
}
