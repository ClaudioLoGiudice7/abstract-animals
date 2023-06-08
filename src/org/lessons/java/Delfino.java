package org.lessons.java;

public class Delfino extends Animale implements INuotante {
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

    @Override
    public void nuota() {
        System.out.println("Sto nuotando!!!");
    }
}