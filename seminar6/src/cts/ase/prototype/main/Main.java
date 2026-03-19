package cts.ase.prototype.main;

import cts.ase.prototype.classes.Rezervare;
import cts.ase.prototype.classes.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        Rezervare rez1 = new Rezervare("Gica", 12, 17, "0754356789");
        Rezervare rez2 = (Rezervare) rez1.clone();

        rez2.setOraRezervare(10);
        rez2.setZiuaRezervare(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
