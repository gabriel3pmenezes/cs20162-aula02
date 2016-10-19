package com.github.gabriel3pmenezes.mvnexe03;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste03 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValidoProduto() {
        PotenciaSomas.produtoInteiros(-4, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValidoProduto() {
        PotenciaSomas.produtoInteiros(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValidoProduto() {
        PotenciaSomas.produtoInteiros(-4, -2);
    }

    @Test
    public void doisNumerosArbitrariosCorretosProduto() {
        assertEquals(10, PotenciaSomas.produtoInteiros(2, 5));
    }

    @Test
    public void outrosDoisNumerosArbitrariosCorretos () {
        assertEquals(12, PotenciaSomas.produtoInteiros(4, 3));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValidoPotencia() {
        PotenciaSomas.potenciaSomas(-2, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValidoPotencia() {
        PotenciaSomas.potenciaSomas(2, -3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValidoPotencia() {
        PotenciaSomas.potenciaSomas(-2, -3);
    }

    @Test
    public void doisNumerosArbitrariosCorretosPotencia() {
        assertEquals(8, PotenciaSomas.potenciaSomas(2, 3));
    }
    
}