package com.github.gabriel3pmenezes.mvnexe05;

import com.github.gabriel3pmenezes.mvnexe05.Propriedade153;
import org.junit.Test;

import static org.junit.Assert.*;

public class Teste05 {

    @Test(expected = IllegalArgumentException.class)
    public void numMaiorQueValido() {
        Propriedade153.propriedade153(1000000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido() {
        Propriedade153.propriedade153(-4);
    }

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, Propriedade153.propriedade153(153));
    }

    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, Propriedade153.propriedade153(154));
    }

}