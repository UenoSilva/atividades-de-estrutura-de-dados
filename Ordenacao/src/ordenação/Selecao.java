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
public class Selecao {

    private int[] vetor;

    public Selecao(int[] vetor) {
        this.vetor = vetor;
    }

    public void ordenar() {
        int eleito;
        int menor;
        int posicao;
        for (int i = 0; i < vetor.length-1; i++) {
            eleito = vetor[i];
            menor = vetor[i+1];
            posicao = i + 1;
            for (int j = i+2; j < vetor.length; j++) {
                if (vetor[j] < menor) {
                    menor = vetor[j];
                    posicao = j;
                }
            }
            if(menor < eleito){
                vetor[i] = vetor[posicao];
                vetor[posicao] = eleito;
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
