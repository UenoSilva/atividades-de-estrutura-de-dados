/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fila;

/**
 *
 * @author Ueno Souza Silva
 */
public class Fila {
    
    private Celula inicio = null;
    private Celula fim = null;
    private Celula aux;
    
    public Fila(){}
    
    public void inserir(int num){
        Celula novo = new Celula(num);
        novo.setProx(null);
        if(inicio == null){
            inicio = novo;
            fim = novo;
        }
        else{
            fim.setProx(novo);
            fim = novo;
        }
        System.out.println("Número inserido na fila");
    }
    
    public void remover(){
        if(inicio == null){
            System.out.println("A fila está vazia");
        }
        else{
            System.out.println(inicio.getValor()+" será removido");
            inicio.setProx(null);
        }
    }
    
    public void fila(){
        
    }
    
}
