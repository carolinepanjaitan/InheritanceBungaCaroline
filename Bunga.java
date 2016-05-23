package com.polymorphism.isa;

public class Bunga {
    String mati = "Layu Sebelum Mati";
    public void mekar(){
        System.out.println("Bunga Mekar");
    }
    
    public void tumbuh(){
        System.out.println("Bunga Tumbuh");
    }
    
    public void mati(){
        System.out.println("Bunga" + " " + mati);
    }
}
