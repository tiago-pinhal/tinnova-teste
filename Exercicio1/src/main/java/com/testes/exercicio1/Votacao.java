package com.testes.exercicio1;

/**
 * Esta classe tem a finalidade de realizar apuração de votos
 *
 * @author Tiago Pinhal
 */
public class Votacao {

    private int qtdTotalVotos;
    private int qtdVotosEmBranco;
    private int qtdVotosNulo;
    private final String msgErrGt = "A quantidade de %s não pode ser maior que o total de votos";
    private final String msgErrLtZero = "A quantidade de %s não pode ser inferior a zero";

    public Votacao() {
    }

    /**
     * Construtor com argumentos
     *
     * @param qtdTotalVotos Total de votos (total de eleitores)
     * @param qtdVotosEmBranco Total de votos em branco
     * @param qtdVotosNulo Total de votos nulo
     */
    public Votacao(int qtdTotalVotos, int qtdVotosEmBranco, int qtdVotosNulo) {
        this.qtdTotalVotos = qtdTotalVotos;
        this.qtdVotosEmBranco = qtdVotosEmBranco;
        this.qtdVotosNulo = qtdVotosNulo;
    }

    /**
     * Calcula a porcentagem de votos válidos
     *
     * @return Porcentagem de votos válidos
     * @throws java.lang.Exception
     */
    public double getPercentualVotosValidos() throws Exception {
        return (double) getTotalVotosValidos() / qtdTotalVotos;
    }

    /**
     * Calcula a porcentagem de votos em branco
     *
     * @return Porcentagem de votos em branco
     * @throws java.lang.Exception
     */
    public double getPercentualVotosEmBranco() throws Exception {
        validarDados();
        return (double) (qtdVotosEmBranco) / qtdTotalVotos;
    }

    /**
     * Calcula a porcentagem de votos nulos
     *
     * @return Porcentagem de votos nulos
     * @throws java.lang.Exception
     */
    public double getPercentualVotosNulo() throws Exception {
        validarDados();
        return (double) (qtdVotosNulo) / qtdTotalVotos;
    }

    /**
     * Calula a quantidade de votos válidos
     *
     * @return Quantidade de votos válidos
     * @throws java.lang.Exception
     */
    public int getTotalVotosValidos() throws Exception {
        validarDados();
        return qtdTotalVotos - qtdVotosEmBranco - qtdVotosNulo;
    }

    /**
     * Valida os dados de entrada para apuração da votação
     *
     * @throws Exception
     */
    public void validarDados() throws Exception {
        if (qtdTotalVotos == 0) {

            throw new Exception("A quantidade de votos não poderá ser igual a zero para não ocorrer erro durante o cálculo da porcentagem");
        }

        if (qtdVotosEmBranco > qtdTotalVotos) {
            throw new Exception(String.format(msgErrGt, "votos em branco"));
        }

        if (qtdVotosNulo > qtdTotalVotos) {
            throw new Exception(String.format(msgErrGt, "votos nulos"));
        }

        if (qtdVotosEmBranco + qtdVotosNulo > qtdTotalVotos) {
            throw new Exception(String.format(msgErrGt, "votos em branco mais os votos nulos"));
        }

        if (qtdTotalVotos < 0) {
            throw new Exception(String.format(msgErrLtZero, "votos"));
        }

        if (qtdVotosEmBranco < 0) {
            throw new Exception(String.format(msgErrLtZero, "votos em branco"));
        }

        if (qtdVotosNulo < 0) {
            throw new Exception(String.format(msgErrLtZero, "votos nulos"));
        }

    }

    public int getQtdTotalVotos() {
        return qtdTotalVotos;
    }

    public void setQtdTotalVotos(int qtdTotalVotos) {
        this.qtdTotalVotos = qtdTotalVotos;
    }

    public int getQtdVotosEmBranco() {
        return qtdVotosEmBranco;
    }

    public void setQtdVotosEmBranco(int qtdVotosEmBranco) {
        this.qtdVotosEmBranco = qtdVotosEmBranco;
    }

    public int getQtdVotosNulo() {
        return qtdVotosNulo;
    }

    public void setQtdVotosNulo(int qtdVotosNulo) {
        this.qtdVotosNulo = qtdVotosNulo;
    }

}
