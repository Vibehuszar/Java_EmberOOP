package hu.petrik.emberekoop;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Ember ember1 = new Ember("Jozsi", "2002-3-13", "Budapest");
        Ember ember2 = new Ember("Gaspar Laci", "2004-10-11", "Budapest");
        Ember ember3 = new Ember("Jani", "2006-2-19", "Miskolc");
        Ember ember4 = new Ember("Feri", "1993-11-23", "Miskolc");
        Ember ember5 = new Ember("Arpi", "2006-2-9", "Miskolc");
        Ember[] emberTomb = new Ember[]{ember1, ember2, ember3, ember4, ember5};
        Emberek ek = new Emberek(emberTomb);
        String fajlNev = "emberek.txt";
        try {
            Emberek ek2 = new Emberek(fajlNev);
        }catch (FileNotFoundException e){
            System.out.printf("A(z) %s nem található", fajlNev);
        } catch (IOException e) {
            System.out.println("Ismeretlen hiba történt");
        }


        System.out.println(ember1);
        System.out.println(ember2);
        System.out.println(ember3);
        System.out.printf("Születési évek: %d, %d, %d\n", ember1.szulEv(), ember2.szulEv(), ember3.szulEv());
        System.out.printf("Első ember ennyi éves: %d\n", ember1.eletKor(ember1.szulEv()));
        System.out.printf("Második ember ennyi éves: %d\n", ember2.eletKor(ember2.szulEv()));
        System.out.printf("Harmadik ember ennyi éves: %d\n", ember3.eletKor(ember3.szulEv()));
        System.out.println(ek);

    }
}