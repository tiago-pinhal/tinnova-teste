package com.teste.exercicio2;

/**
 * Classe que realiza a ordenação de um vetor utilizando o algoritmo Bubble Sort
 *
 * @author Tiago Pinhal
 *
 */
public class BubbleSort {

    /**
     * Ordena o vetor passado por parametro
     *
     * @param arr Vetor a ser ordenado
     * @return Vetor ordenado
     */
    public static int[] ordenarVetor(int[] arr) {
        int temp;

        for (int interacao = 0; interacao < arr.length; interacao++) {
            for (int indice = 0; indice < arr.length - interacao - 1; indice++) {
                if (arr[indice] > arr[indice + 1]) {
                    temp = arr[indice];
                    arr[indice] = arr[indice + 1];
                    arr[indice + 1] = temp;
                }
            }
        }
        return arr;
    }
}
