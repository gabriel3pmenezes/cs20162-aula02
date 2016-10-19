package com.github.gabriel3pmenezes.mvnexe08;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste08 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MaiorDivisorComum01.crivoEratostenes(3, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MaiorDivisorComum01.crivoEratostenes(3, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MaiorDivisorComum01.crivoEratostenes(0, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        MaiorDivisorComum01.crivoEratostenes(4, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido4() {
        MaiorDivisorComum01.crivoEratostenes(-4, -3);
    }
}
