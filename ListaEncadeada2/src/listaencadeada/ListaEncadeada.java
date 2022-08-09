/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class ListaEncadeada {
    
    private Celula inicio = null;
    private Celula fim = null;
    private Celula aux;
    int posicao;
    
    public void inserir(int num){
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
        posicao++;
        System.out.println("Número inserido na lista");
        System.out.println(posicao + " elemento adicionado");
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
    
    public int acessar(int k){
        aux = inicio;
        for(int i = 0; i < k-1; i++){
            aux = aux.getProx();
        }
        return aux.getNum();
    }
    
    public void remover(int k){
        Celula anterior;
        int achou;
        if(inicio == null){
            System.out.println("A lista está vazia");
        }
        else{
            aux = inicio;
            anterior = null;
            achou = 0;
            while(aux != null){
                if(aux.getNum() == k){
                    achou++;
                    if(aux == inicio){
                        inicio = aux.getProx();
                        aux = inicio;
                    }
                    else if(aux == fim){
                        anterior.setProx(null);
                        fim = anterior;
                        aux = null;
                    }
                    else{
                        anterior.setProx(aux.getProx());
                        aux = aux.getProx();
                    }
                }
                else{
                    anterior = aux;
                    aux = aux.getProx();
                }
                if(achou == 0){
                    System.out.println("Número não encontrado");
                }
                else if(achou == 1){
                    System.out.println("Número removido 1 vez");
                }
                else{
                    System.out.println("Número removido " + achou + " vezes");
                }
            }
        }
    }
}
