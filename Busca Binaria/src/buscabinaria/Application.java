/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscabinaria;

import java.util.ArrayList;

/**
 *
 * @author Ueno Souza Silva
 */
public class Application {
    
    public static void main(String[] args){
        ArrayList<Integer> v = new ArrayList<>();
        
        for(int i = 0; i < 10; i++){
            v.add(i+1);
        }
        for(int i = 0; i < v.size(); i++){
            System.out.print(i+": " + v.get(9)+ ", ");
        }
        System.out.println("");
        
        BuscaBinaria busca = new BuscaBinaria(v);
        System.out.println(busca.busca(1));
        
    }
    
}
