package com.teste.exercicio3;

import java.util.stream.IntStream;

/**
 * Classe que calcula o Fatorial de um determinado número
 *
 * @author Tiago Pinhal
 */
public class Fatorial {

    /**
     * Calcula o fatorial de um número
     *
     * @param numero Valor inicial para ser calculado o fatorial
     * @return Resultado fatorial
     */
    public static int getFatorialFrom(int numero) {
        return numero > 0 ? IntStream.range(1, numero + 1).reduce((previous, current) -> previous * current).getAsInt() : 1;
    }

}
