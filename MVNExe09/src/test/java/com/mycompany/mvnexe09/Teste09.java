package com.mycompany.mvnexe09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste09 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe09.CrivoEratostenesSubtracoes(10, 20));
    }

    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, MVNExe09.CrivoEratostenesSubtracoes(-34, 25));
    }

}