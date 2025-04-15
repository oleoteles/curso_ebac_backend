/**
 * 
 */
package br.com;

import static org.junit.Assert.assertNotNull;


import org.junit.Test;

import br.com.dao.ICarroDao;
import br.com.dao.IMarcaDao;
import br.com.dao.MarcaDao;
import br.com.dao.CarroDao;
import br.com.domain.Carro;
import br.com.domain.Marca;

/**
 * 
 */
public class CarroTest {
	
	private ICarroDao carroDao;
	
	private IMarcaDao marcaDao;
	
	public CarroTest() {
		carroDao = new CarroDao();
		marcaDao = new MarcaDao();
	}

	@Test
	public void cadastrar() {
		Marca marca = criarMarca("A1");
		
		Carro carro = new Carro();
		carro.setCodigo("A1");
		carro.setNome("Celta");
		carro.setQuantidade(12);
		carro.setMarca(marca);
		carro = carroDao.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
	}
	
	private Marca criarMarca(String codigo) {
		Marca marca = new Marca();
		marca.setCodigo(codigo);
		marca.setNome("Chevrolet");
		return marcaDao.cadastrar(marca);
	}
}	
