package com.example.finale;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void getFactor(){
        Factorial fac = new Factorial();
        assertEquals(120, fac.getFactor(5));

    }

    @Test
    void getTotal(){
        Factorial fac = new Factorial();
        fac.getFactor(5);
        fac.getFactor(5);
        assertEquals(240, fac.getTotal());
    }
}
