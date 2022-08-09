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
public class Application {
    
    public static void main(String[] args){
        Celula c1 = new Celula(34);
        Celula c2 = new Celula(304);
        Celula c3 = new Celula(340);
        Celula c4 = new Celula(3);
        
        Pilha p = new Pilha();
        
        p.lista();
        
        p.inserir(c1.getValor());
        p.inserir(c2.getValor());
        p.inserir(c3.getValor());
        p.inserir(c4.getValor());
        
        p.lista();
        
        p.remover();
        p.lista();
    }
    
}
