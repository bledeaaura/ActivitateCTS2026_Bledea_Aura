package cts.ase.simpleFactory.factory;

import cts.ase.simpleFactory.factoryClasses.Autobuz;
import cts.ase.simpleFactory.factoryClasses.MijlocTransport;
import cts.ase.simpleFactory.factoryClasses.Tramvai;
import cts.ase.simpleFactory.factoryClasses.Troleibuz;

public class FabricaMijloaceTransport {

    public MijlocTransport getMijlocDeTransport(TipuriTransport tipuriTransport, int numarRoti, String numarInmatriculare){
        if (tipuriTransport == TipuriTransport.AUTOBUZ){
            return new Autobuz(numarRoti, numarInmatriculare);
        }
        if(tipuriTransport == TipuriTransport.TRAMVAI){
            return new Tramvai(numarRoti, numarInmatriculare);
        }
        if(tipuriTransport == TipuriTransport.TROLEIBUZ){
            return new Troleibuz(numarRoti, numarInmatriculare);
        }
        return null;
    }
}
