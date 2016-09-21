package com.mycompany.mvnexe05;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste05 {

    @Test(expected = IllegalArgumentException.class)
    public void numMaiorQueValido() {
        MVNExe05.Propriedade153(1000000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe05.Propriedade153(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe05.Propriedade153(153));
    }

    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, MVNExe05.Propriedade153(154));
    }

}