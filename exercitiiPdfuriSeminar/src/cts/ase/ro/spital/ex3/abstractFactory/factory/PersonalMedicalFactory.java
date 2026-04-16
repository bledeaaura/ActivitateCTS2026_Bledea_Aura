package cts.ase.ro.spital.ex3.abstractFactory.factory;

import cts.ase.ro.spital.ex3.abstractFactory.enums.EPersonalMedical;
import cts.ase.ro.spital.ex3.abstractFactory.factoryClasses.Asistent;
import cts.ase.ro.spital.ex3.abstractFactory.factoryClasses.Brancardier;
import cts.ase.ro.spital.ex3.abstractFactory.factoryClasses.Medic;

public class PersonalMedicalFactory {
    public static IPersonalMedical getPersonalMedical(EPersonalMedical tip){
        switch (tip){
            case BRANCARDIER :return new Brancardier();
            case ASISTENT:return new Asistent();
            case MEDIC:return new Medic();
            default:throw new PersonalMedicalException("Post invalid pentru acest tip");
        }
    }
}
