package PrimeiroTeste;

import org.junit.Assert;
import org.junit.Test;

import Main.Aluno;
import Main.Sala;

import java.util.List;
import java.util.stream.Collectors;

public class TesteTarefa {
	 	@Test
	    public void testListaSimplesAlunos() {
	        Sala sala = new Sala();
	        List<Aluno> lista = sala.criarListaAlunos();

	        List<Aluno> femininos = lista.stream()
	                .filter(aluno -> aluno.getSexo().equals("Feminino"))
	                .collect(Collectors.toList());

	        Assert.assertEquals(2, femininos.size());

	        Assert.assertEquals("Antônia Silva", femininos.get(0).getNome());
	        Assert.assertEquals("Mariana Andrade", femininos.get(1).getNome());
	    }
}
