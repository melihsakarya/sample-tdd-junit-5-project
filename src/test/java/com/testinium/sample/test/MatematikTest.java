package com.testinium.sample.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MatematikTest {

    Matematik mat = new Matematik();

    @Test
    public void toplamaTest(){
        int sonuc = mat.topla(2, 4);
        assertEquals(6, sonuc);
    }

    @Test
    public void toplamaEksiKontrolTest(){
        assertEquals(2, mat.topla(-4, 2));
    }

    @ParameterizedTest
    @CsvSource({"2,2,4", "6,2,10", "4,2,6", "8,8,16"})
    public void toplamaDataDrivenTest(int sayi1, int sayi2, int toplam){
        assertEquals(toplam, mat.topla(sayi1, sayi2));
    }

    @Test
    public void eksiIslemTest(){
        assertEquals(4 , mat.cikarma(8, 4));
    }

    @Test
    public void eksiIslemEksiSayiKontrolTest(){
        assertEquals(-8 , mat.cikarma(-6, 8));
    }

    @Test
    public void carpmaTest(){
        assertEquals(8, mat.carpma(2, 4));
    }

    @Test
    public void carpmaSifirVeEksiKontrolTest(){
        assertEquals(4, mat.carpma(-2, 4));
    }



}
