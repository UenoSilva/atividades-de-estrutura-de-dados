/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Ueno Souza Silva
 */
public class Pilha {
    
    private Celula topo = null;
    private Celula aux = null;
    
    public Pilha(){}
    
    public void inserir(int valor){
        Celula novo = new Celula(valor);
        novo.setProx(topo);
        topo = novo;
        System.out.println("Número inserido na pilha");
    }
    
    public void remover(){
        if(topo == null){
            System.out.println("Pilha está vazia");
        }
        else{
            System.out.println("Número "+topo.getValor()+" será removido");
            topo = topo.getProx();
        }
    }
    
    public void lista(){
        if(topo == null){
            System.out.println("Pilha vazia");
        }
        else{
            aux = topo;
            while(aux != null){
                System.out.print(aux.getValor()+" ");
                aux = aux.getProx();
            }
        }
    }
}
