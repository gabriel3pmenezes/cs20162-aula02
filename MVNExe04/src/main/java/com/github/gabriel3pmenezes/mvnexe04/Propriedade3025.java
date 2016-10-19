/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe04;

/**
 * Implementação da checagem da propriedade 3025.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class Propriedade3025 {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private Propriedade3025() {
    }

    /**
     * Confere a propriedade 3025 do numero 'n' fornecido.
     * @param n O valor a ser checado. Valor entre 0 e 9999, inclusive.
     *
     * @return Boolean representando a conferencia ou não da propriedade.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * zero ou maior do que 9999).
     */
    public static boolean propriedade3025(final int n) {
        final int divisor = 100;
        final int max = 9999;
        if ((n < 0) || (n > max)) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = n / divisor;
        int j = n % divisor;

        return n == (i + j) * (i + j);
    }
}
