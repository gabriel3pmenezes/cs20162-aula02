package com.github.gabriel3pmenezes.mvnexe02;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste02 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void primeiroNumMenorqueValido() {
        ProdutoInteiros.produtoInteiros(-4, 2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void segundoNumMenorqueValido() {
        ProdutoInteiros.produtoInteiros(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void ambosNumMenorqueValido() {
        ProdutoInteiros.produtoInteiros(-4, -2);
    }

    @Test
    public void doisNumerosArbitrariosCorretos() {
        assertEquals(10, ProdutoInteiros.produtoInteiros(2, 5));
    }
    
    @Test
    public void outrosDoisNumerosArbitrariosCorretos () {
        assertEquals(12, ProdutoInteiros.produtoInteiros(4, 3));
    }
}