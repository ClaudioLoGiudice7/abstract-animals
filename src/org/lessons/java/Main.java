package org.lessons.java;

public class Main {
    public static void faiVolare(IVolante animale){
        animale.vola();
    }
    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }
    public static void main(String[] args) {
        Cane cane = new Cane();
        Passerotto passerotto = new Passerotto();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();

        faiVolare(passerotto);
        faiVolare(aquila);
        faiNuotare(delfino);

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
