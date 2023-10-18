package TabelaHash;

public class Main {                                             
    public static void main(String [] args) {
    	long tempoInicial = System.currentTimeMillis();			  //tempo inicial antes da execução
    	
        Hash hash = new Hash(8);                                  // Cria uma tabela Hash com o tamanho passando de parametro
        hash.inserir(new Fila(3, "Douglas"));                     // Insere n elementos
        hash.inserir(new Fila(5, "Lincoln"));
        hash.inserir(new Fila(19, "Matheus"));
        hash.inserir(new Fila(20, "Julio"));
        hash.inserir(new Fila(33, "Cassia"));
        hash.inserir(new Fila(34, "Milena"));
        hash.inserir(new Fila(353, "Renan"));
        hash.inserir(new Fila(351, "Marcos"));
        hash.inserir(new Fila(358, "Gabriel"));
        hash.inserir(new Fila(356, "Silvana"));
        
        System.out.println("Tabela hash gerada: \n" + hash);       // Imprime a tabela Hash e suas listas
        
        System.out.println("\nChave buscada: "+hash.buscar(20));   // Busca um elemento
        
        System.out.println("\nChave removida: "+hash.remover(33)+"\n"); //Remove um elemento
        
        hash.inserir(new Fila(353, "Lucas"));
        
        System.out.println("\nTabela hash gerada: \n" + hash);
        
        
        long tempoFinal = System.currentTimeMillis();	 	 		//tempo final depois da execução
        System.out.printf("%.3f ms%n", (tempoFinal - tempoInicial) / 1000d); //calculo que mostra tempo total gasto pela execução
    }
}