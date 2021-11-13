package com.testes.exercicio1;

/**
 * Votos em relação ao total de eleitores
 *
 * @author Tiago Pinhal
 */
public class Principal {

    public static void main(String args[]) {
        int numeroDeEleitores = 1000; //Quantidade de votos
        int numeroVotosEmBranco = 150;
        int numeroVotosNulos = 50;

        try {
            Votacao votacao = new Votacao(numeroDeEleitores, numeroVotosEmBranco, numeroVotosNulos);
            System.out.println("* Percentual de votos válidos: " + votacao.getPercentualVotosValidos());
            System.out.println("* Percentual de votos em branco: " + votacao.getPercentualVotosEmBranco());
            System.out.println("* Percentual de votos nulos: " + votacao.getPercentualVotosNulo());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
        //Possui arquivo de teste
    }
}
