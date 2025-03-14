package tarefaAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.CONSTRUCTOR})
public @interface Tabela {
	String nome();
}
