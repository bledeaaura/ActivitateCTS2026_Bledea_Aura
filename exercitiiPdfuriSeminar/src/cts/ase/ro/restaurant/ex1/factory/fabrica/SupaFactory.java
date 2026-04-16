package cts.ase.ro.restaurant.ex1.factory.fabrica;

import cts.ase.ro.restaurant.ex1.factory.factoryClasses.ISupa;
import cts.ase.ro.restaurant.ex1.factory.factoryClasses.SupaCiuperci;
import cts.ase.ro.restaurant.ex1.factory.factoryClasses.SupaLegume;
import cts.ase.ro.restaurant.ex1.factory.factoryClasses.SupaVita;

public class SupaFactory {
    public static ISupa getSupa(TipSupa tipSupa){
        switch (tipSupa){
            case LEGUME : return new SupaLegume();
            case CIUPERCI: return new SupaCiuperci();
            case VITA: return new SupaVita();
            default: throw new SupaException("Supa nu exista in meniu");
        }
    }
}
