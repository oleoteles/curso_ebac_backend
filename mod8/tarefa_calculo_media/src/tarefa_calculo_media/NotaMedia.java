package tarefa_calculo_media;

public class NotaMedia {
	
	public static void main(String args[]) {
		calculoMedia();
	}
	
	public static void calculoMedia() {
		double nota1 = 7;
		double nota2 = 5;
		double nota3 = 6;
		double nota4 = 8;
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println (media);
	}
}
