package cts.ase.ro.spital.ex3.abstractFactory.main;

import cts.ase.ro.spital.ex3.abstractFactory.enums.EPersonalMedical;
import cts.ase.ro.spital.ex3.abstractFactory.enums.EPersonalNonMedical;
import cts.ase.ro.spital.ex3.abstractFactory.factory.IPersonalMedical;
import cts.ase.ro.spital.ex3.abstractFactory.factory.IPersonalNonMedical;
import cts.ase.ro.spital.ex3.abstractFactory.factory.PersonalMedicalFactory;
import cts.ase.ro.spital.ex3.abstractFactory.factory.PersonalNonMedicalFactory;

public class Main {
    public static void main(String[] args) {
        IPersonalMedical pMed1 = PersonalMedicalFactory.getPersonalMedical(EPersonalMedical.BRANCARDIER);
        IPersonalMedical pMed2 = PersonalMedicalFactory.getPersonalMedical(EPersonalMedical.ASISTENT);
        IPersonalMedical pMed3 = PersonalMedicalFactory.getPersonalMedical(EPersonalMedical.MEDIC);

        IPersonalNonMedical pNonMed1 = PersonalNonMedicalFactory.getPersonalNonMedical(EPersonalNonMedical.SECRETAR);
        IPersonalNonMedical pNonMed2 = PersonalNonMedicalFactory.getPersonalNonMedical(EPersonalNonMedical.REGISTRATOR);

        pMed1.afiseazaDetaliiPersonalMedical();
        pMed2.afiseazaDetaliiPersonalMedical();
        pMed3.afiseazaDetaliiPersonalMedical();

        pNonMed1.afiseazaDetaliiPersonalNonMedical();
        pNonMed2.afiseazaDetaliiPersonalNonMedical();
    }
}
