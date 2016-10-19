package com.github.gabriel3pmenezes.mvnexe01;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste01 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        SomaNaturais.somaNaturais(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(55, SomaNaturais.somaNaturais(10));
    }
}