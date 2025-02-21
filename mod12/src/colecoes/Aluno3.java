package colecoes;

public class Aluno3 {
	private String nome;

    public Aluno3(String nome) {
        this.nome = nome;
    }

	public int compareTo(Aluno3 aluno) {
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

