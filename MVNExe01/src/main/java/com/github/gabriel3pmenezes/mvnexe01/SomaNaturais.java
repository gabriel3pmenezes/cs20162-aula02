/*
 * Copyright (c) 2016. Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gabriel3pmenezes.mvnexe01;

/**
 * Implementação da soma dos 'n' primeiros números naturais.
 * <p>Algoritmo correspondente ao obtido da lista da aula 2,
 * Construção de Software,
 * Professor Fábio Nogueira Lucena, 2016/2
 */
public final class SomaNaturais {

    /**
     * Classe contendo apenas operações "static".
     * Evita que instância seja criada desnecessariamente.
     */
    private SomaNaturais() {
    }
    /**
     * Obtém a soma para o valor de 'n'.
     * @param n O valor para cálculo do somatório. Valor maior ou igual a um.
     *
     * @return O valor do somatório total realizado.
     *
     * @throws IllegalArgumentException Se o número for inválido (menor do que
     * um).
     */
    public static int somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número fora da faixa");
        }
        int s = 1;
        int i = 2;
        while (i <= n) {
            s = s + i;
            i = i + 1;
        }
        return s;
    }
}
