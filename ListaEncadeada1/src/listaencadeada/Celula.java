
package listaencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class Celula {
    
    private int num;
    private Celula prox;
    
    public Celula(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Celula getProx() {
        return prox;
    }

    public void setProx(Celula prox) {
        this.prox = prox;
    }
   
}
