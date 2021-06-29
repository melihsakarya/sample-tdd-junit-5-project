package com.testinium.sample.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class FaizIslemleriTest {

    @Test
    public void faizHesaplamaTest(){
        FaizIslemleri faizIslemleri = new FaizIslemleri();
        faizIslemleri.mailIslemleri = Mockito.mock(MailIslemleri.class);
        //faizIslemleri.mailIslemleri = new MailIslemleri();
        System.out.println(faizIslemleri.mailIslemleri.faizOrani());

        Mockito.when(faizIslemleri.mailIslemleri.faizOrani()).thenReturn(20);
        System.out.println(faizIslemleri.mailIslemleri.faizOrani());

        Mockito.when(faizIslemleri.mailIslemleri.faizOrani()).thenCallRealMethod();
        System.out.println(faizIslemleri.mailIslemleri.faizOrani());
        Assertions.assertEquals(12, faizIslemleri.faizHesaplama());
    }
}
