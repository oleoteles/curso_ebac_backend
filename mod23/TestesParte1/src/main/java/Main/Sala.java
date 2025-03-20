/**
 * 
 */
package Main;

import Main.Aluno;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 */
public class Sala {
	public static void main(String args[]) {
        ListaSimplesAlunos();
    }
 
 private static void ListaSimplesAlunos() {
        System.out.println("****** ListaSimplesAlunos ******");
        List<Aluno> lista = new ArrayList<Aluno>();

        Aluno a = new Aluno("João Pedro", "Masculino");
        Aluno b = new Aluno("Antônia Silva", "Feminino");
        Aluno c = new Aluno("Francisco José", "Masculino");
        Aluno d = new Aluno("Mariana Andrade", "Feminino");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
        
        System.out.println("Gênero Masculino:");
        for (Aluno aluno : lista) {
            if (aluno.getSexo().startsWith("M")) {
                System.out.println(aluno);
            }
        }

        System.out.println(" ");

        System.out.println("Gênero Feminino:");
        for (Aluno aluno : lista) {
            if (aluno.getSexo().startsWith("F")) {
                System.out.println(aluno);
            }
        }
        
        System.out.println(" ");   
        
        lista.stream()
        		.filter(aluno -> aluno.getSexo().equals("Feminino"))
        		.forEach(al -> System.out.println(al.getNome()));
    }
 	
 	public List<Aluno> criarListaAlunos() {
	     List<Aluno> lista = new ArrayList<>();
	
	     Aluno a = new Aluno("João Pedro", "Masculino");
	     Aluno b = new Aluno("Antônia Silva", "Feminino");
	     Aluno c = new Aluno("Francisco José", "Masculino");
	     Aluno d = new Aluno("Mariana Andrade", "Feminino");
	
	     lista.add(a);
	     lista.add(b);
	     lista.add(c);
	     lista.add(d);
	
	     Collections.sort(lista); 
	
	     return lista;
 }
}
