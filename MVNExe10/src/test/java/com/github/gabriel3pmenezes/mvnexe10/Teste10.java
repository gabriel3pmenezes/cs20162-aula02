package com.github.gabriel3pmenezes.mvnexe10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste10 {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        NumeroHarmonico.numeroHarmonico(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, NumeroHarmonico.numeroHarmonico(4));
    }

}