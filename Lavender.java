package com.polymorphism.isa;

public class Lavender extends Bunga {

    @Override
    public void mati() {
        System.out.println("Bunga"+" "+super.mati);
    }

    @Override
    public void tumbuh() {
        super.tumbuh(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mekar() {
        super.mekar(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
