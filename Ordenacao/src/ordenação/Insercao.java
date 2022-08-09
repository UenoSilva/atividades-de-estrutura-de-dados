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
public class Insercao {

    private int[] vetor;

    public Insercao(int[] vetor) {
        this.vetor = vetor;
    }

    public void ordenar() {
        int eleito;
        int i, j;
        for (i = 1; i < vetor.length; i++) {
            eleito = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > eleito) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = eleito;
        }
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
    

}
