package com.mycompany.mvnexe08;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste08 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(1, MVNExe08.CrivoEratostenes(3, 4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MVNExe08.CrivoEratostenes(3, -1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MVNExe08.CrivoEratostenes(3, -4);
    }

}