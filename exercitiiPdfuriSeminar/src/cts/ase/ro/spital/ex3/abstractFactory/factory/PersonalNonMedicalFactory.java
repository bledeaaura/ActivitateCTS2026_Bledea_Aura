package cts.ase.ro.spital.ex3.abstractFactory.factory;

import cts.ase.ro.spital.ex3.abstractFactory.enums.EPersonalNonMedical;
import cts.ase.ro.spital.ex3.abstractFactory.factoryClasses.Registrator;
import cts.ase.ro.spital.ex3.abstractFactory.factoryClasses.Secretar;

public class PersonalNonMedicalFactory {
    public static IPersonalNonMedical getPersonalNonMedical(EPersonalNonMedical tip){
        switch (tip){
            case SECRETAR :return new Secretar();
            case REGISTRATOR: return new Registrator();
            default: throw new PersonalNonMedicalException("Post invalid pentru acest tip");
        }
    }
}
