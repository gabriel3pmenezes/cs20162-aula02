/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe10;

/**
 * Implementação do 'n'-esimo numero harmônico.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class NumeroHarmonico {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private NumeroHarmonico() {
    }

    /**
     * Obtém o 'n'-esimo número harmônico.
     * @param n O valor para cálculo do número harmônico. Valor maior que um.
     *
     * @return O valor do 'n'-esimo número harmônico.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static int numeroHarmonico(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int i = 2;
        int s = 1;

        while (i <= n) {
            s = s + (1 / i);
            i = i + 1;
        }

        return s;
    }
}
