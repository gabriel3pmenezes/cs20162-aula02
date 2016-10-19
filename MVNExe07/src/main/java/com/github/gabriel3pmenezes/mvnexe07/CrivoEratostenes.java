/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */



package com.github.gabriel3pmenezes.mvnexe07;

/**
 * Implementação do Crivo de Eratostenes.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class CrivoEratostenes {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private CrivoEratostenes() {
    }

    /**
     * Gera o Crivo de Eratostenes.
     * @param n O primeiro valor para o cálculo do Crivo. Valor maior do que um
     * e maior do que 'i'.
     * @param i O segundo valor para o cálculo do Crivo. Valor maior do que dois
     * @throws IllegalArgumentException Se o 'n' for inválido (menor do que
     * um ou  menor do que 'i') ou se 'i' for inválido (menor do que dois).
     */
    public static void crivoEratostenes(final int n, int i) {
        if ((n < 1) || (n < i)) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        if (i < 2) {
            throw new IllegalArgumentException("Número fora da faixa");
        }

        int x   = 0;
        int a[] = new int[x];
        int c;
        int cont;

        for (cont = 0; cont < x; cont++) {
            a[cont] = 0;
        }

        while (i <= (n / 2)) {
            if (a[i] == 0) {
                c = i + i;

                while (c <= n) {
                    a[c] = 1;
                    c    = c + 1;
                }
            }

            i = i + 1;
        }
    }
}
