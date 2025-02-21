package colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import colecoes.Aluno3;

public class Sala3 {
	public static void main(String args[]) {
        ListaSimplesAlunos();
    }
 
 private static void ListaSimplesAlunos() {
        System.out.println("****** ListaSimplesAlunos ******");
        List<Aluno3> lista = new ArrayList<Aluno3>();

        Aluno3 a = new Aluno3("João Pedro-M");
        Aluno3 b = new Aluno3("Antônia Silva-F");
        Aluno3 c = new Aluno3("Francisco José-M");
        Aluno3 d = new Aluno3("Mariana Andrade-F");
        lista.add(a);
        lista.add(b);
        lista.add(c);
        lista.add(d);
        
        System.out.println("Gênero Masculino:");
        for (Aluno3 aluno : lista) {
            if (aluno.getNome().contains("-M")) {
                System.out.println(aluno);
            }
        }

        System.out.println(" ");

        System.out.println("Gênero Feminino:");
        for (Aluno3 aluno : lista) {
            if (aluno.getNome().contains("-F")) {
                System.out.println(aluno);
            }
        }
        
        System.out.println(" ");
        
        System.out.println("Com o modo split");

        Scanner Nomes = new Scanner(System.in);
        System.out.println("Digite o nome e o genêro separados por traço e separe os nomes por vírgula");

        String resposta = Nomes.nextLine();
        String[] listaAlunos = resposta.split(",");

        System.out.println("Gênero Masculino:");
        for (int i = 0; i < listaAlunos.length; i++) {
            if (listaAlunos[i].contains("-M")) {
                System.out.println(listaAlunos[i]);
            }
        }

        System.out.println("Gênero Feminino:");
        for (int i = 0; i < listaAlunos.length; i++) {
            if (listaAlunos[i].contains("-F")) {
                System.out.println(listaAlunos[i]);
            }
        }
 	}
}