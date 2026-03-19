package cts.ase.abstractFactory.factory;

import cts.ase.abstractFactory.factoryClasses.FelDeMancare;
import cts.ase.abstractFactory.factoryClasses.TipFelMancare;

public interface FabricaAbstracta {
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj);
    public FelDeMancare getTipFelMancare(TipFelMancare tipFelMancare, double pret, float gramaj, int calorii);
}
