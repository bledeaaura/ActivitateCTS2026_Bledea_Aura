package cts.ase.ro.spital.ex3.abstractFactory.factoryClasses;

import cts.ase.ro.spital.ex3.abstractFactory.factory.IPersonalMedical;

public class Asistent implements IPersonalMedical {
    @Override
    public void afiseazaDetaliiPersonalMedical() {
        System.out.println("POST: ASISTENT");
    }
}
