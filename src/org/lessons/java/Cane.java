package org.lessons.java;

public class Cane extends Animale {
    @Override
    public void dormi(){
        System.out.println("zzz");
    }
    @Override
    public void verso(){
        System.out.println("bau");
    }
    @Override
    public void mangia(){
        System.out.println("carne");
    }
}
