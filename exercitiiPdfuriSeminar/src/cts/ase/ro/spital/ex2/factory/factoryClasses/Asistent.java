package cts.ase.ro.spital.ex2.factory.factoryClasses;

import cts.ase.ro.spital.ex2.factory.factory.IPersonalSpital;

public class Asistent implements IPersonalSpital {
    @Override
    public void afisarePersonalSpital() {
        System.out.println("Postul acesta este de asistent");
    }
}
