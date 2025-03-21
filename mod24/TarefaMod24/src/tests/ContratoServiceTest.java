package tests;

import org.junit.Assert;
import org.junit.Test;

import mocks.ContratoDao;
import mocks.IContratoDao;
import mocks.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;
import org.junit.Assert;

public class ContratoServiceTest {

	@Test
    public void salvarTest() {
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void buscarTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar("Leonardo");
        Assert.assertEquals("Cliente não encontrado. Tente novamente", retorno);
    }
    
    @Test
    public void excluirTest() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir("Leonardo");
        Assert.assertEquals(false, retorno);
    }
    
    @Test
    public void atualizar() {
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar(1);
        Assert.assertEquals("Sucesso", retorno);
    }

    //TODO
    //Fazer métodos de buscar, excluir e atualizar
}
