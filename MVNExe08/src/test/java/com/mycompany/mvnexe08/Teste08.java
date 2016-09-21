package com.mycompany.mvnexe08;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste08 {

    @Test
    public void umNumeroArbitrarioCorreto() {
        assertEquals(true, MVNExe08.CrivoEratostenes(10, 20));
    }

    @Test
    public void umNumeroArbitrarioFalso() {
        assertEquals(false, MVNExe08.CrivoEratostenes(-14, 30));
    }

}