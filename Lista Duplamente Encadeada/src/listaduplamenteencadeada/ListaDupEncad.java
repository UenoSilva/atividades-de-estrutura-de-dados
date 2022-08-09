package listaduplamenteencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class ListaDupEncad {
    
    private Celula inicio = null;
    private Celula fim = null;
    private Celula aux;
    private int tamanho;
    
    public void inserirInicio(int num){
        Celula novo = new Celula(num);
        if(inicio == null){
            inicio = novo;
            fim = novo;
            novo.setProximo(null);
            novo.setAnterior(null);
        }
        else{
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            novo.setAnterior(null);
            inicio = novo;
        }
        System.out.println("Número inserido no inicio da lista");
        tamanho++;
    }
    
    public void inserirFim(int num){
        Celula novo = new Celula(num);
        if(inicio == null){
            inicio = novo;
            fim = novo;
            novo.setProximo(null);
            novo.setAnterior(null);
        }
        else{
            novo.setAnterior(fim);
            fim.setProximo(novo);
            novo.setProximo(null);
            fim = novo;  
        }
        System.out.println("Número inserido no final da lista");
        tamanho++;
    }
    
    public void mostraListaInicioAoFim(){
        aux = inicio;
        while(aux != null){
            System.out.print(aux.getValor()+" ");
            aux = aux.getProximo();
        }
        System.out.println("");
    }
    
    public void mostraListaFimAoInicio(){
        aux = fim;
        while(aux != null){
            System.out.print(aux.getValor()+" ");
            aux = aux.getAnterior();
        }
        System.out.println("");
    }
    
    public void remover(int k){
        int achou;
        if(inicio == null){
            System.out.println("A lista está vazia");
        }
        else{
            aux = inicio;
            achou = 0;
            while(aux != null){
                if(aux.getValor() == k){
                    achou++;
                    if(aux == inicio){
                        inicio = aux.getProximo();
                        if(inicio != null){
                            inicio.setAnterior(null);
                        }
                        aux = inicio;
                    }
                    else if(aux == fim){
                        fim = fim.getAnterior();
                        fim.setProximo(null);
                        aux = null;
                    }
                    else{
                        aux.setAnterior(aux.getProximo());
                        aux.setProximo(aux.getProximo());
                        aux.setProximo(aux.getAnterior());
                        aux.setAnterior(aux.getAnterior());
                        aux = aux.getProximo();
                    }
                }
                else{
                    aux = aux.getProximo();
                }
                if(achou == 0){
                    System.out.println("Número removido 1 vez");
                }
                else{
                    System.out.println("Número removido "+achou+" vezes");
                }
            }
        }
    }    
}
