/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe03;

/**
 * Implementação da potência de um número através de somas.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class PotenciaSomas {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private PotenciaSomas() {
    }

    /**
     * Obtém a potencia dos dois inteiros recebidos.
     * @param x O primeiro número para a potencia. Valor maior que zero.
     * @param y O segundo número para o potencia. Valor maior que zero.
     *
     * @return O valor da potencia realizada pelos números recebidos.
     *
     * @throws IllegalArgumentException Se o primeiro número for inválido (menor
     * ou igual a zero) ou segundo número for inválido (menor ou igual a zero).
     */
    public static int potenciaSomas(final int x, final int y) {
        if (x < 0) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        if (y < 0) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int potencia = 1;
        int i = 1;

        while (i <= y) {
            potencia = produtoInteiros(potencia, x);
            i = i + 1;
        }

        return potencia;
    }

    /**
     * Obtém o produto dos dois inteiros recebidos.
     * @param num1 O primeiro número para o produto. Valor maior que zero.
     * @param num2 O segundo número para o produto. Valor maior que zero.
     *
     * @return O valor do produto realizado dos números recebidos.
     *
     * @throws IllegalArgumentException Se o primeiro número for inválido (menor
     * ou igual a zero) ou segundo número for inválido (menor ou igual a zero).
     */
    public static int produtoInteiros(final int num1, final int num2) {
        if (num1 < 0) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        if (num2 < 0) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = 1;
        int s = 0;
        int parcela;
        int totalParcelas;

        if (num1 <= num2) {
            parcela = num2;
            totalParcelas = num1;
        } else {
            parcela = num1;
            totalParcelas = num2;
        }

        while (i <= totalParcelas) {
            s = s + parcela;
            i = i + 1;
        }

        return s;
    }
}
