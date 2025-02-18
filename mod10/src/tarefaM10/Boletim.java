package tarefaM10;

public class Boletim {

		public static void main(String args[]) {
			calculoMedia();
		}
		
		public static void calculoMedia() {
			double nota1 = 7;
			double nota2 = 5;
			double nota3 = 6;
			double nota4 = 8;
			
			double media = (nota1 + nota2 + nota3 + nota4)/4;
			
			if (media >= 7) {
				System.out.println ("Parabéns! Você foi aprovado.");
			} else if (media >= 5) {
				System.out.println ("Você não atingiu a média. Você está de recuperação.");
			} else {
				System.out.println ("Você foi reprovado.");
		}

	}

}
