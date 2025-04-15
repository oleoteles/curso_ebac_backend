package br.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dao.AcessorioDao;
import br.com.dao.IAcessorioDao;
import br.com.dao.IMarcaDao;
import br.com.dao.MarcaDao;
import br.com.domain.Acessorio;
import br.com.domain.Marca;

public class AcessorioTest {

private IAcessorioDao acessorioDao;
	
	public AcessorioTest() {
		acessorioDao = new AcessorioDao();
	}

	@Test
	public void cadastrar() {
	Acessorio acessorio = new Acessorio();
	acessorio.setCodigo("10");
	acessorio.setNome("Parabrisa");
	acessorio.setTipo("Dianteiro");
	acessorio = acessorioDao.cadastrar(acessorio);
		
	assertNotNull(acessorio);
	assertNotNull(acessorio.getId());
	}
}
