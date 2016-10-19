/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe09;

/**
 * Implementação do maior divisor comum através do Crivo de Eratostenes
 * de Subtrações.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class MaiorDivisorComum02 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private MaiorDivisorComum02() {
    }

    /**
     * Obtém o maior divisor comum entre 'a' e 'b'.
     * @param a O primeiro valor para checagem. Valor maior que zero e menor do
     * que 'b'.
     * @param b O segundo valor para checagem. Valor maior que zero.
     *
     * @return O valor do maior divisor comum.
     *
     * @throws IllegalArgumentException Se o número 'a' for inválido (maior ou
     * igual a b ou menor do que zero) ou se 'b' for inválido (menor do que
     * zero).
     */
    public static int crivoEratostenesSubtracoes(final int a, final int b) {
        if (a >= b) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        if ((b < 0) || (a < 0)) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int c = a;
        int d = b;
        while (c != d) {
            if (c > d) {
                c = c - d;
            } else {
                d = d - c;
            }
        }

        return c;
    }
}
