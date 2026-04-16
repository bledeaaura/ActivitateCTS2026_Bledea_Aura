package cts.ase.ro.spital.ex3.abstractFactory.factoryClasses;

import cts.ase.ro.spital.ex3.abstractFactory.factory.IPersonalNonMedical;

public class Secretar implements IPersonalNonMedical {
    @Override
    public void afiseazaDetaliiPersonalNonMedical() {
        System.out.println("POST: SECRETAR");
    }
}
