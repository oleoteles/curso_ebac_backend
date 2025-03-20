/**
 * 
 */
package Main;

/**
 * 
 */
public class Aluno implements Comparable<Aluno>{

    private String nome;
    private String sexo;

    public Aluno(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

	@Override
	public int compareTo(Aluno aluno) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(aluno.getNome());
	}
	
	@Override
    public String toString() {
        return nome + " (" + sexo + ")";
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	} 
}
