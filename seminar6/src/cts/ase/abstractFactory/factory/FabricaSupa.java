package cts.ase.abstractFactory.factory;

import cts.ase.abstractFactory.enums.TipSupa;
import cts.ase.abstractFactory.factoryClasses.FelDeMancare;
import cts.ase.abstractFactory.factoryClasses.SupaDeCiuperci;
import cts.ase.abstractFactory.factoryClasses.SupaDeLegume;
import cts.ase.abstractFactory.factoryClasses.TipFelMancare;

public class FabricaSupa implements FabricaAbstracta{
    @Override
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj) {
        if (tipFelMancare == TipSupa.LEGUME){
            return new SupaDeLegume(pret, gramaj);
        } else if (tipFelMancare == TipSupa.CIUPERCI) {
            return new SupaDeCiuperci(pret, gramaj);
        }
        return null;
    }

    @Override
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj, int calorii) {
        return getTipFelMancare(tipFelMancare, pret, gramaj, calorii);
    }
}
