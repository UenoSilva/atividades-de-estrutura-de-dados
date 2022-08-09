package fila;

/**
 *
 * @author Ueno Souza Silva
 */
public class Celula {
    
    private int valor;
    private Celula prox;
    
    public Celula(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }
    
}
