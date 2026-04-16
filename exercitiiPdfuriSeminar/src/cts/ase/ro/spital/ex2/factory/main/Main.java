package cts.ase.ro.spital.ex2.factory.main;

import cts.ase.ro.spital.ex2.factory.enums.PersonalSpital;
import cts.ase.ro.spital.ex2.factory.factory.IPersonalSpital;
import cts.ase.ro.spital.ex2.factory.factory.PersonalSpitalFabrica;

public class Main {
    public static void main(String[] args) {
        IPersonalSpital p1 = PersonalSpitalFabrica.getPersonalSpital(PersonalSpital.BRANCARDIER);
        IPersonalSpital p2 = PersonalSpitalFabrica.getPersonalSpital(PersonalSpital.ASISTENT);
        IPersonalSpital p3 = PersonalSpitalFabrica.getPersonalSpital(PersonalSpital.MEDIC);

        p1.afisarePersonalSpital();
        p2.afisarePersonalSpital();
        p3.afisarePersonalSpital();
    }
}
