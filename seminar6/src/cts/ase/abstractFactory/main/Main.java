package cts.ase.abstractFactory.main;

import cts.ase.abstractFactory.enums.TipDesert;
import cts.ase.abstractFactory.enums.TipSupa;
import cts.ase.abstractFactory.factory.FabricaDesert;
import cts.ase.abstractFactory.factory.FabricaSupa;
import cts.ase.abstractFactory.factoryClasses.FelDeMancare;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelDeMancare supaCiuperci = fabricaSupa.getTipFelMancare(TipSupa.CIUPERCI, 15.20, 30);
        FelDeMancare supaLegume = fabricaSupa.getTipFelMancare(TipSupa.LEGUME, 20.22, 44);

        FelDeMancare clatita = fabricaDesert.getTipFelMancare(TipDesert.CLATITA, 45.44, 3);
        FelDeMancare papanas = fabricaDesert.getTipFelMancare(TipDesert.PAPANAS, 45.88, 9);

        supaCiuperci.afisare();
        supaLegume.afisare();
        clatita.afisare();
        papanas.afisare();
    }
}
