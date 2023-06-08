package org.lessons.java;

public class Aquila extends Animale implements IVolante{
    @Override
    public void dormi(){
        System.out.println("zzz");
    }
    @Override
    public void verso(){
        System.out.println("screech");
    }
    @Override
    public void mangia(){
        System.out.println("carne");
    }

    @Override
    public void vola() {
        System.out.println("Sto volando!!!");
    }
}
