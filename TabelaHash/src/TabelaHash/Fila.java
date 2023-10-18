package TabelaHash;

public class Fila {	        
	private int senha;		// Senha da fila
	private String nome;	// Nome da pessoa com a senha
	
	Fila(int senha, String nome) {
	 this.senha = senha;			
	 this.nome = nome;				
	}

	public String toString() {
	
		return "(" + senha + ", " + nome + ")";
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}