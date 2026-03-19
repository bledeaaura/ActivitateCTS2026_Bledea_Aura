package cts.ase.abstractFactory.factory;

import cts.ase.abstractFactory.enums.TipDesert;
import cts.ase.abstractFactory.factoryClasses.Clatita;
import cts.ase.abstractFactory.factoryClasses.FelDeMancare;
import cts.ase.abstractFactory.factoryClasses.Papanas;
import cts.ase.abstractFactory.factoryClasses.TipFelMancare;

public class FabricaDesert implements FabricaAbstracta{
    @Override
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj) {
        return getTipFelMancare(tipFelMancare, pret, gramaj, 0);
    }

    @Override
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj, int calorii) {
        if(tipFelMancare == TipDesert.CLATITA){
            return new Clatita(pret, gramaj, calorii);
        } else if (tipFelMancare == TipDesert.PAPANAS) {
            return new Papanas(pret, gramaj, calorii);
        }
        return null;
    }
}
