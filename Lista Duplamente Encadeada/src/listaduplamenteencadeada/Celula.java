package listaduplamenteencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class Celula {
    
    private int valor;
    private Celula proximo;
    private Celula anterior;
    
    public Celula(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
    
    
    
}
