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
public class Application {
    
    public static void main(String[] args){
        Celula c1 = new Celula(34);
        Celula c2 = new Celula(35);
        Celula c3 = new Celula(36);
        Celula c4 = new Celula(37);
        Celula c5 = new Celula(38);
        
        Fila fila = new Fila();
        
        fila.fila();
        fila.inserir(c1.getValor());
        fila.inserir(c2.getValor());
        fila.inserir(c3.getValor());
        fila.inserir(c4.getValor());
        fila.inserir(c5.getValor());
        fila.fila();
        fila.remover();
        fila.fila();
        
    }
    
}
