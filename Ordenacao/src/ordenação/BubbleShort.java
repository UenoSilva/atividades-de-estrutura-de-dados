/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

/**
 *
 * @author Ueno Souza Silva
 */
public class BubbleShort {
    
    private int[] vetor;

    public BubbleShort(int[] vetor) {
        this.vetor = vetor;
    }
    
    public void ordenar(){
        int aux;
        for(int i = 1; i < vetor.length; i++){
            for(int j = 0; j < vetor.length - 1; j++){
                if(vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
}
