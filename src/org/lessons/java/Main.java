package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        cane.dormi();
        cane.verso();
        cane.mangia();

        passerotto.dormi();
        passerotto.verso();
        passerotto.mangia();

        aquila.dormi();
        aquila.verso();
        aquila.mangia();

        delfino.dormi();
        delfino.verso();
        delfino.mangia();
    }
}
