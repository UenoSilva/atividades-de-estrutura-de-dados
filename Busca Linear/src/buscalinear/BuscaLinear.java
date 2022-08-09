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
public class BuscaLinear {
    
    private int[] numero;
    private int aux = -1;

    public BuscaLinear(int[] numero) {
        this.numero = numero;
    }
    
    public void buscaLinearNO(int valorProcurado){
        int achou = 0;
        int cont = 0;
        while(cont <= numero.length-1 && achou == 0){
            if(valorProcurado == numero[cont]){
                achou=1;
                aux = cont;
                System.out.println("Valor encontrado na posição: "+cont);
            }
            else{
                cont++;
                System.out.println("Valor não encotrado");
            }
        }
    }
    
}
