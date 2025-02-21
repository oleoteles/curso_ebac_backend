package colecoes;

public class Aluno2 implements Comparable<Aluno2>{
	private String nome;

    public Aluno2(String nome) {
        this.nome = nome;
    }

	public int compareTo(Aluno2 aluno) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(aluno.getNome());
	}
	
	@Override
    public String toString() {
        return nome;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}

