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
public class Application {
    
    public static void main(String[] args){
        int[] vetor = {5, 8, 7, 1, 4, 2, 9, 3, 6};
        Selecao selecao = new Selecao(vetor);
        Insercao insercao = new Insercao(vetor);
        BubbleShort bubbleShort = new BubbleShort(vetor);
        
//        selecao.ordenar();
//        insercao.ordenar();
        bubbleShort.ordenar();
//        int[] v = selecao.getVetor();
//        int[] v = insercao.getVetor();
        int[] v = bubbleShort.getVetor();
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i]+" ");
        }
    }
    
}
