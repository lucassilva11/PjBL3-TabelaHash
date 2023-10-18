package TabelaHash;

public class Hash {
    private int tamanho;                               // Tamanho da tabela hash
    private Lista[] vetor;                             // Vetor das listas

	Hash(int tamanho) {                               
        this.tamanho = tamanho;                       
        vetor = new Lista[tamanho];                    // Cria a tabela com o tamanho passado no parametro
        for (int i = 0; i < tamanho; i++) {            
            vetor[i] = new Lista();                    // Para cada posicao no vetor inicializa uma lista para aquela posição.
        }
    }

    void inserir(Fila fila) {                     
        int chave = fila.getSenha() % tamanho;            // Posicao = resto do codigo / tamanho
        if(buscar(fila.getSenha()) == null) {
        	vetor[chave].inserir(fila);                   // Insere senha e nome naquela posição
        }else {
        	System.out.println("A Senha "+ fila.getSenha()+ " já existe!"); // verificação de senha única.
        }
        
    }

    Fila remover(int senha) {
    	int chave = senha % tamanho;                      // Posicao = resto do codigo / tamanho
        return vetor[chave].remover(senha);  			  // Chama o metodo remover da classe Lista para setar a posição com -1;
    }
    
    Fila buscar(int senha) {                              
        return vetor[senha % tamanho].buscar(senha);      // Busca apenas na lista especifica
    }
    

    public String toString() {                          
        String print = "";                                
        for(int i = 0; i < tamanho; i++) {                // Para cada posicao no vetor de Listas adiciona uma string representando o indice da Lista
        	print += "" + i + ": ";                       
        	print += vetor[i % tamanho] + "\n";			  // Adiciona o conteudo do índice
        }
        return print;                                     // Retorna a String
    }



	public int getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public Lista[] getVetor() {
		return vetor;
	}
	
	public void setVetor(Lista[] vetor) {
		this.vetor = vetor;
	}
		
}
