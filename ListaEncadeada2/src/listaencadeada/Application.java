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
public class Application {
    
    public static void main(String[] args){
        
        Celula c1 = new Celula(234);
        Celula c2 = new Celula(24);
        Celula c3 = new Celula(34);
        Celula c4 = new Celula(4);
        Celula c5 = new Celula(3);
        Celula c6 = new Celula(20);
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.mostrarLista();
        lista.inserir(c1.getNum());
        lista.inserir(c6.getNum());
        lista.inserir(c3.getNum());
        lista.mostrarLista();
        
        System.out.println("valor"+lista.acessar(2));
        
        lista.remover(234);
        lista.mostrarLista();
        
    }
    
}
