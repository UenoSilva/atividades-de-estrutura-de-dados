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
        
        Celula c1 = new Celula(0);
        Celula c2 = new Celula(4);
        Celula c3 = new Celula(23);
        Celula c4 = new Celula(12);
        Celula c5 = new Celula(3);
        ListaEncadeada lista = new ListaEncadeada();
        
        lista.inserirInicio(c1.getNum());
        lista.inserirInicio(c2.getNum());
        lista.inserirFim(c3.getNum());
        
        lista.mostrarLista();
        
        
    }
    
}
