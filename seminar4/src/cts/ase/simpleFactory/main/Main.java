package cts.ase.simpleFactory.main;

import cts.ase.simpleFactory.factory.FabricaMijloaceTransport;
import cts.ase.simpleFactory.factory.TipuriTransport;
import cts.ase.simpleFactory.factoryClasses.MijlocTransport;

public class Main {
    public static void main(String[] args) {
        FabricaMijloaceTransport fabrica = new FabricaMijloaceTransport();
        MijlocTransport autobuz = fabrica.getMijlocDeTransport(TipuriTransport.AUTOBUZ, 4, "ABC45U");
        MijlocTransport tramvai = fabrica.getMijlocDeTransport(TipuriTransport.TRAMVAI, 8, "hsgsfsg");
        MijlocTransport troleu = fabrica.getMijlocDeTransport(TipuriTransport.TROLEIBUZ, 4, "vnhsdcf");

        autobuz.afiseazaDescriere();
        tramvai.afiseazaDescriere();
        troleu.afiseazaDescriere();
    }
}
