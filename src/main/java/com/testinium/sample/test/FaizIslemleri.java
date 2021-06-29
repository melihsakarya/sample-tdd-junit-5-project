package com.testinium.sample.test;

public class FaizIslemleri {

    public MailIslemleri mailIslemleri;


    public int faizHesaplama(){
        mailIslemleri.mailGonder();
        kaydet();
        return 12;
    }

    private void kaydet(){
        throw new IllegalArgumentException("hata olustu");
    }
}
