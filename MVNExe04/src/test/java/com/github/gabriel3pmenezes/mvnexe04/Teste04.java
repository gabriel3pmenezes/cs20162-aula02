package com.github.gabriel3pmenezes.mvnexe04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste04 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        Propriedade3025.propriedade3025(-4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMaiorqueValido() {
        Propriedade3025.propriedade3025(10000);
    }

    @Test
    public void umNumeroArbitrarioVerdadeiro() {
        assertEquals(true, Propriedade3025.propriedade3025(3025));
    }
    
    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, Propriedade3025.propriedade3025(3024));
    }
}