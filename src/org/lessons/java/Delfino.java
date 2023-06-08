package org.lessons.java;

public class Delfino extends Animale {
    @Override
    public void dormi(){
        System.out.println("zzz");
    }
    @Override
    public void verso(){
        System.out.println("squi");
    }
    @Override
    public void mangia(){
        System.out.println("pesce");
    }
}