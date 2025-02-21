package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import colecoes.Aluno2;

public class Sala2 {
		
		 public static void main(String args[]) {
		        ListaSimplesAlunos();
		    }
		 
		 private static void ListaSimplesAlunos() {
		        System.out.println("****** ListaSimplesAlunos ******");
		        List<Aluno2> lista = new ArrayList<Aluno2>();

		        Aluno2 a = new Aluno2("João Pedro");
		        Aluno2 b = new Aluno2("Antônia Silva");
		        Aluno2 c = new Aluno2("Francisco José");
		        Aluno2 d = new Aluno2("Mariana Andrade");
		        lista.add(a);
		        lista.add(b);
		        lista.add(c);
		        lista.add(d);
		        System.out.println("Lista sem ordenação alfabética: " + lista);
		        
		        Collections.sort(lista);
		        System.out.println("Lista com ordenação alfabética: " + lista);
		        System.out.println("");
	 }
}
