package com.github.gabriel3pmenezes.mvnexe07;

import org.junit.Test;

public class Teste07 {
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        CrivoEratostenes.crivoEratostenes(0, 3);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        CrivoEratostenes.crivoEratostenes(4, 6);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        CrivoEratostenes.crivoEratostenes(0, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido4() {
        CrivoEratostenes.crivoEratostenes(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido5() {
        CrivoEratostenes.crivoEratostenes(-4, -2);
    }
}