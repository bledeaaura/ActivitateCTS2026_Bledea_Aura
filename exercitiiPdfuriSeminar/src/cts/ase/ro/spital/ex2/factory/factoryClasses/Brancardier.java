package cts.ase.ro.spital.ex2.factory.factoryClasses;

import cts.ase.ro.spital.ex2.factory.factory.IPersonalSpital;

public class Brancardier implements IPersonalSpital {
    @Override
    public void afisarePersonalSpital() {
        System.out.println("Acest post este de brancardier");
    }
}
