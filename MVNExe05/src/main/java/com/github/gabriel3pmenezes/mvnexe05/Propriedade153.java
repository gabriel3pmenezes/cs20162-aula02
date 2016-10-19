/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe05;

/**
 * Implementação da conferencia da propriedade 153 de um numero 'n'.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class Propriedade153 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private Propriedade153() {
    }

    /**
     * Confere a propriedade 153 de um numero.
     * @param n O valor a ser checado. Valor entre 0 e 9999, inclusive.
     *
     * @return Boolean representando a conferência ou não da propriedade.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * zero ou maior do que 9999).
     */
    public static boolean propriedade153(final int n) {
        final int div10 = 10;
        final int div100 = 100;
        final int max = 9999;
        if ((n < 0) || (n > max)) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = n / div100;
        int j = (n - (div100 * i)) / div10;
        int k = n % div10;

        return n == (i * i * i) + (j * j * j) + (k * k * k);
    }
}
