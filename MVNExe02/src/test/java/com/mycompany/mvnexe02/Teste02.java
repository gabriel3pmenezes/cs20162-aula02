package com.mycompany.mvnexe02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste02 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValido() {
        MVNExe02.Produto(-4, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValido() {
        MVNExe02.Produto(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValido() {
        MVNExe02.Produto(-4, -2);
    }

    @Test
    public void doisNumerosArbitrariosCorretos() {
        assertEquals(10, MVNExe02.Produto(2, 5));
    }
}