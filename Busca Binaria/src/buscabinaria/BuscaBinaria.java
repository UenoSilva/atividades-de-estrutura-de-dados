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
public class BuscaBinaria {

    private int inicio;
    private int fim;
    private int meio;
    private int valorDoMeio;
    private ArrayList<Integer> v;

    public BuscaBinaria(ArrayList<Integer> v) {
        this.v = v;
    }

    public int busca(int numero) {
        inicio = 0;
        fim = v.size() - 1;

        while (inicio != fim) {
            meio = (int) (inicio + fim) / 2;
            valorDoMeio = v.get(meio);
            if (numero == valorDoMeio) {
                return meio;
            }
            if (numero < valorDoMeio) {
                fim = meio - 1;
            } else {
                inicio = meio - 1;
            }
        }
        if (v.get(0) == numero) {
            return inicio;
        } else {
            return -1;
        }
    }

}
