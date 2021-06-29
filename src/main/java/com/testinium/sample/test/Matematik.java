package com.testinium.sample.test;

public class Matematik {

    public int topla(int sayi1, int sayi2){
        if(sayi1 < 0){
            sayi1 = 0;
        }
        return sayi1 + sayi2;
    }


    public int cikarma(int sayi1, int sayi2) {
        if(sayi1 < 0 ){
            sayi1 = 0;
        }
        return sayi1- sayi2;
    }

    public int carpma(int sayi1, int sayi2) {
        if(sayi1 < 1 ){
            sayi1 = 1;
        }
        return sayi1 * sayi2;
    }
}
