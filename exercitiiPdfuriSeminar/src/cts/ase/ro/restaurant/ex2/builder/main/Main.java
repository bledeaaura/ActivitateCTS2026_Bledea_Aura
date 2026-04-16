package cts.ase.ro.restaurant.ex2.builder.main;

import cts.ase.ro.restaurant.ex2.builder.Rezervare;
import cts.ase.ro.restaurant.ex2.builder.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare1 = new RezervareBuilder().setAsezareGeam(true).setGenMuzica(true).build();
        rezervare1.afiseazaDetalii();
    }
}
