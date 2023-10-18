package TabelaHash;

public class Node {
	private Fila info;           //Informação do nó
	private Node prox;			 //Váriavel para percorrer a lista
	
	public Fila getInfo() {
		return info;
	}
	public void setInfo(Fila info) {
		this.info = info;
	}
	public Node getProx() {
		return prox;
	}
	public void setProx(Node prox) {
		this.prox = prox;
	}
}
