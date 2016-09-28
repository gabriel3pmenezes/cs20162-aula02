package com.mycompany.mvnexe03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste03 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValidoProduto() {
        MVNExe03.Produto(-4, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValidoProduto() {
        MVNExe03.Produto(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValidoProduto() {
        MVNExe03.Produto(-4, -2);
    }

    @Test
    public void doisNumerosArbitrariosCorretosProduto() {
        assertEquals(10, MVNExe03.Produto(2, 5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValidoPotencia() {
        MVNExe03.Potencia(-2, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValidoPotencia() {
        MVNExe03.Potencia(2, -3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValidoPotencia() {
        MVNExe03.Potencia(-2, -3);
    }

    @Test
    public void doisNumerosArbitrariosCorretosPotencia() {
        assertEquals(8, MVNExe03.Potencia(2, 3));
    }
    
}