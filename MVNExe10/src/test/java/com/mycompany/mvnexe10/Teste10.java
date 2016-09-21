package com.mycompany.mvnexe10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste10 {

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe10.NumeroHarmonico(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MVNExe10.NumeroHarmonico(4));
    }

}