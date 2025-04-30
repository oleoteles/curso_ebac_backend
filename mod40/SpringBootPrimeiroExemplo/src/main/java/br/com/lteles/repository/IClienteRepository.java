/**
 * 
 */
package br.com.lteles.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.lteles.domain.Cliente;

/**
 * 
 */
@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
