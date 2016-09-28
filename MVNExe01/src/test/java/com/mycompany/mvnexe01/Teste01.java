package com.mycompany.mvnexe01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste01 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe01.Soma(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(55, MVNExe01.Soma(10));
    }
}