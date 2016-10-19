package com.github.gabriel3pmenezes.mvnexe06;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste06 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        NumeroPrimo.primo(-4);
    }

    @Test
    public void umNumeroArbitrarioVerdadeiro() {
        assertEquals(true, NumeroPrimo.primo(5));
    }
    
    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, NumeroPrimo.primo(6));
    }
}