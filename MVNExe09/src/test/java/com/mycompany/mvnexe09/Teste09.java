package com.mycompany.mvnexe09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste09 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MVNExe09.CrivoEratostenesSubtracoes(3, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MVNExe09.CrivoEratostenesSubtracoes(3, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MVNExe09.CrivoEratostenesSubtracoes(3, -4);
    }
}