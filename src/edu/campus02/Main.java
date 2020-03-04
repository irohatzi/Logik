package edu.campus02;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	// BSP 1: die Sonne scheint und es regnet
        //Variable deklarieren
        boolean dieSonneScheint;
        boolean esRegnet;
        // definieren
        dieSonneScheint = true;
        esRegnet = false;

        boolean ergebnis;
        ergebnis = dieSonneScheint && esRegnet;

        //sout -> Tab
        System.out.println("die Sonne scheint UND es regnet: " + ergebnis);

        //BSP2: ich bin verwirrt ODER ich kenne mich aus
        boolean ichBinVerwirrt;
        boolean ichKennMichAus;

        ichBinVerwirrt = true;
        ichKennMichAus = false;

        ergebnis = ichBinVerwirrt || ichKennMichAus;
        System.out.println("ich bin verwirrt oder ich kenne mich aus: " + ergebnis);

        // BSP 3: (1>3 UND (Nicht 3<5)) ODER 2==4
        // (1>3 && (! 3-1 < 5)) || 2 == 4
        boolean teil1;
        boolean teil2;
        boolean ergebnis3;

        teil2 = 2 == 4;
        teil1 = 1 > 3 && !(3-1 < 5);
        ergebnis3 = teil1 || teil2;

        System.out.println("Ergebnis 3: " + ergebnis3);

        // BSP 4: (6>= 2*3 || 2-3<0) && (1*1==1 && 1!= 1+1)
        boolean teila;
        boolean teilb;
        boolean ergebnis4;

        teila = (6>=2*3 || 2-3<0);
        teilb = (1*1==1 && 1!= 1+1);
        ergebnis4 = teila && teilb;

        System.out.println("Ergebnis 4: " + ergebnis4);

    }
}
