package com.SOLID;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Coche cocheM = new CocheMotor();
        System.out.println(cocheM.getTipo());
        Coche cocheE = new CocheElectrico();
        System.out.println(cocheE.getTipo());
        Coche cocheH = new CocheHibrido();
        System.out.println(cocheH.getTipo());
        Coche coche = new Coche();
        System.out.println(coche.getTipo());

    }
}
