/**
 * 
 */
package br.com;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.dao.IMarcaDao;
import br.com.dao.MarcaDao;
import br.com.domain.Marca;

/**
 * 
 */
public class MarcaTest {

	private IMarcaDao marcaDao;
	
	public MarcaTest() {
		marcaDao = new MarcaDao();
	}

	@Test
	public void cadastrar() {
		Marca marca = new Marca();
		marca.setCodigo("1");
		marca.setNome("Chevrolet");
		marca = marcaDao.cadastrar(marca);
		
		assertNotNull(marca);
		assertNotNull(marca.getId());
	}
}
