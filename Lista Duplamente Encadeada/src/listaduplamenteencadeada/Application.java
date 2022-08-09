/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaduplamenteencadeada;

/**
 *
 * @author Ueno Souza Silva
 */
public class Application {
    
    public static void main(String[] args){
        Celula c1 = new Celula(23);
        Celula c2 = new Celula(3);
        Celula c3 = new Celula(20);
        Celula c4 = new Celula(203);
        Celula c5 = new Celula(230);
        Celula c6 = new Celula(200);
        Celula c7 = new Celula(233);
        
        ListaDupEncad lista = new ListaDupEncad();
        
        lista.inserirInicio(c1.getValor());
        lista.inserirFim(c2.getValor());
        lista.inserirInicio(c3.getValor());
        lista.inserirFim(c4.getValor());
        lista.inserirInicio(c5.getValor());
        lista.inserirFim(c6.getValor());
        lista.inserirFim(c7.getValor());
        
        lista.mostraListaFimAoInicio();
        lista.mostraListaInicioAoFim();
        
        lista.remover(233);
        lista.mostraListaInicioAoFim();
    }
    
}
