package com.teste.exercicio4;

/**
 * Exercicio 4: Soma dos múltiplos de 3 ou 5
 *
 * @author Tiago Pinhal
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Soma dos multiplos de 3 ou 5 = " + getSomaMult3ou5From(20));
    }

    /**
     * Retorna o somatório dos multiplos de 3 ou 5 abaixo do número passado como
     * parâmetro
     *
     * @param numero
     * @return Somatório dos Multiplos
     */
    public static int getSomaMult3ou5From(int numero) {
        int soma = 0;

        for (int x = 1; x < numero; x++) {
            if (x % 3 == 0 || x % 5 == 0) {
                soma += x;
            }
        }

        return soma;
    }

}
