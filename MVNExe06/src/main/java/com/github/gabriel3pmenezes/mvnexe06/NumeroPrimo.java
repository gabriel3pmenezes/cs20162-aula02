/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe06;

/**
 * Implementação da checagem de primo de um numero 'n'.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class NumeroPrimo {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private NumeroPrimo() {
    }

    /**
     * Confere se o número 'n' é primo.
     * @param n O valor para checagem. Valor maior do que 1.
     *
     * @return Boolean representando a checagem ou não do primo.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static boolean primo(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i;
        int cont = 0;

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont = cont + 1;
            }
        }

        return cont == 2;
    }
}
