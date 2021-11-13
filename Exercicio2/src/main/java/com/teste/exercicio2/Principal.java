package com.teste.exercicio2;

import java.util.Arrays;

/**
 * Algoritmo de ordenação Bubble Sort
 *
 * @author Tiago Pinhal
 */
public class Principal {

    public static void main(String args[]) {
        int[] arr = {5, 3, 2, 4, 7, 1, 0, 6};
        System.out.println(Arrays.toString(BubbleSort.ordenarVetor(arr)));
        //Possui arquivo de teste
    }

}
