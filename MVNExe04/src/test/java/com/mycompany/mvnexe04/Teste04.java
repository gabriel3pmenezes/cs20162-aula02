package com.mycompany.mvnexe04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste04 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        MVNExe04.Propriedade3025(-4);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMaiorqueValido() {
        MVNExe04.Propriedade3025(10000);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe04.Propriedade3025(3025));
    }
}