/**
 * 
 */
package br.com.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 */
public class Acessorio {

	 @Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
	 @SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
	 private Long id;
	    
	 @Column(name = "codigo", length = 10, nullable = false, unique = true)
	 private String codigo;
	    
	 @Column(name = "nome", length = 50, nullable = false)
	 private String nome;
	    
	 @Column(name = "tipo", length = 50, nullable = false)
	 private String tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
