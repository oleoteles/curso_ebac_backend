package tarefaReflections;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeAnotacao {
	
	private Class<?> classe;

    public LeitorDeAnotacao(Class<?> classe) {
        this.classe = classe;
    }

    public Annotation[] getAnnotationsClass() {
        return classe.getDeclaredAnnotations();
    }
    
    public void printFieldAnnotations() {
        for (Field field : classe.getDeclaredFields()) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("Campo: " + field.getName() + " - Anotação: " + annotation);
            }
        }
  }
}

