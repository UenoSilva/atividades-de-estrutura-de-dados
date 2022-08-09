
package listaencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class ListaEncadeada {
    
    private Celula inicio = null;
    private Celula fim = null;
    private Celula aux;
    private Celula anterior;
    
    public void inserirInicio(int num){
        Celula novo = new Celula(num);
        if(inicio == null){
            inicio = novo;
            fim = novo;
            novo.setProx(null);
        }
        else{
            novo.setProx(inicio);
            inicio = novo;
        }
        System.out.println("Número inserido no inicio da lista");
    }
    
    public void inserirFim(int num){
        Celula novo = new Celula(num);
        if(inicio == null){
            inicio = novo;
            fim = novo;
            novo.setProx(null);
        }
        else{
            fim.setProx(novo);
            fim = novo;
            fim.setProx(null);
        }
        System.out.println("Número inserido no fim da lista");
    }
    
    public void mostrarLista(){
        if(inicio == null){
            System.out.println("A lista está vazia");
        }
        else{
            aux = inicio;
            while(aux != null){
                System.out.println(aux.getNum() + " ");
                aux = aux.getProx();
            }
        }
    }
    
}
