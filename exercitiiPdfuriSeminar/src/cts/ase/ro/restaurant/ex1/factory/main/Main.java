package cts.ase.ro.restaurant.ex1.factory.main;

import cts.ase.ro.restaurant.ex1.factory.fabrica.SupaFactory;
import cts.ase.ro.restaurant.ex1.factory.fabrica.TipSupa;
import cts.ase.ro.restaurant.ex1.factory.factoryClasses.ISupa;

public class Main {
    public static void main(String[] args) {
        ISupa supa1 = SupaFactory.getSupa(TipSupa.LEGUME);
        ISupa supa2= SupaFactory.getSupa(TipSupa.CIUPERCI);
        ISupa supa3 = SupaFactory.getSupa(TipSupa.VITA);

        supa1.afisareSupa();
        supa2.afisareSupa();
        supa3.afisareSupa();
    }
}
