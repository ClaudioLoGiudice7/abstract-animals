package org.lessons.java;

public class Passerotto extends Animale implements IVolante{
    @Override
    public void dormi(){
        System.out.println("zzz");
    }
    @Override
    public void verso(){
        System.out.println("cip");
    }
    @Override
    public void mangia(){
        System.out.println("semi");
    }
    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
