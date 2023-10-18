package TabelaHash;

public class Lista {
    private Node inicio;                 // Ponteiro para o inicio da Lista

    public void inserir(Fila info) {     
        Node no = new Node();            
        no.setInfo(info);                // Atribui a informação ao no
        no.setProx(inicio);              // O ponteiro próximo do no inserido aponta para o inicio
        inicio = no;                     // O inicio passa a ser esse novo no
    }
    
    public Fila remover(int senha) {
    	Node no = inicio;                
        while (no != null) {                
            if (no.getInfo().getSenha() == senha) {   // Se a senha do no for igual ao parametro passado ele seta a chave -1 e vazio
            	Fila fila = no.getInfo();
            	no.setInfo(new Fila(-1, ""));
            	//no.setInfo(null);
            	return fila;
           }
           no = no.getProx();                         // Caso nao encontre no nó, vai para o proximo no
        }
        return null;
    }

    public Fila buscar(int senha) {                   // Metodo buscar pela senha
        Node no = inicio;                   
        while (no != null) {                
            if (no.getInfo().getSenha() == senha) {   // Se a senha do no for igual ao parametro passado, retorna a informacao do nó
                return no.getInfo();             
           }
           no = no.getProx();                         // Caso nao encontre no nó, vai para o proximo no
        }
       return null;
    }

    public String toString() {              
        String print = "";                    		// Cria uma string vazia para retorno
        Node no = inicio;                     		
        while (no != null) {                  
        	print += no.getInfo() + " ";            // Adiciona na string a info
            no = no.getProx();                      
        }
        return print;                               
    }

    
    
    
	public Node getInicio() {
		return inicio;
	}

	public void setInicio(Node inicio) {
		this.inicio = inicio;
	}
}