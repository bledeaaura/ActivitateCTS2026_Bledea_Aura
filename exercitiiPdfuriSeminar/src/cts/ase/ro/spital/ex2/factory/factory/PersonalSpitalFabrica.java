package cts.ase.ro.spital.ex2.factory.factory;

import cts.ase.ro.spital.ex2.factory.enums.PersonalSpital;
import cts.ase.ro.spital.ex2.factory.factoryClasses.Asistent;
import cts.ase.ro.spital.ex2.factory.factoryClasses.Brancardier;
import cts.ase.ro.spital.ex2.factory.factoryClasses.Medic;

public class PersonalSpitalFabrica {
    public static IPersonalSpital getPersonalSpital(PersonalSpital tipPersonal){
        switch (tipPersonal){
            case BRANCARDIER: return new Brancardier();
            case ASISTENT: return new Asistent();
            case MEDIC:return new Medic();
            default:throw new PersonalException("Post invalid");
        }
    }
}
