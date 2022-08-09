/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscalinear;

/**
 *
 * @author Ueno Souza Silva
 */
public class Application {
    
    public static void main(String[] args){
        
        int[] num = {1, 23, 7, 34, 2, 8, 89, 4, 90, 87, 5};
        
        BuscaLinear busca = new BuscaLinear(num);
        busca.buscaLinearNO(5);
    }
    
}
