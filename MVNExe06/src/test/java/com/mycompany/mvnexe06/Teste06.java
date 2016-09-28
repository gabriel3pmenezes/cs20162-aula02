package com.mycompany.mvnexe06;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste06 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe06.Primo(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe06.Primo(5));
    }
}