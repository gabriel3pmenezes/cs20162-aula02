package com.github.gabriel3pmenezes.mvnexe09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste09 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MaiorDivisorComum02.crivoEratostenesSubtracoes(3, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MaiorDivisorComum02.crivoEratostenesSubtracoes(3, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MaiorDivisorComum02.crivoEratostenesSubtracoes(0, 0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        MaiorDivisorComum02.crivoEratostenesSubtracoes(4, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido4() {
        MaiorDivisorComum02.crivoEratostenesSubtracoes(-4, -3);
    }
}