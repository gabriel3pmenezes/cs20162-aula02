package com.mycompany.mvnexe07;

import org.junit.Test;

import static org.junit.Assert.*;

public class Teste07 {
    
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido1() {
        MVNExe07.CrivoEratostenes(-4, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido2() {
        MVNExe07.CrivoEratostenes(4, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void numMenorqueValido3() {
        MVNExe07.CrivoEratostenes(-4, -2);
    }
    
}