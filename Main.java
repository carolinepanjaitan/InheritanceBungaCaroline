package com.polymorphism.isa;

public class Main {
    public static void main(String[] args) {
        Lavender lavender = new Lavender();
        lavender.tumbuh();
        lavender.mekar();
        lavender.mati();
        
        Lily lily = new Lily();
        lily.tumbuh();
        lily.mati();
        lily.mekar();
        
        Bunga bunga = new Bunga();
        bunga.tumbuh();
        bunga.mekar();
        bunga.mati();
}
}