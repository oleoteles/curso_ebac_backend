package tarefaReflections;

import java.lang.annotation.Annotation;

public class Main {
	 public static void main(String[] args) {
		 
		 LeitorDeAnotacao leitorDeAnotacao = new LeitorDeAnotacao(Escola.class);

		 System.out.println("Anotações na Classe:");
	     Annotation[] annotations = leitorDeAnotacao.getAnnotationsClass();
	     for (Annotation anot : annotations) {
	            System.out.println(anot);
	     }
	     System.out.println("Anotações nos Campos:");
	     leitorDeAnotacao.printFieldAnnotations();
	   }
}
