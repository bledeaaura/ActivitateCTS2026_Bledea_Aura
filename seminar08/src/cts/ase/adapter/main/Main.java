import cts.ase.adapter.clase.adapterObiecte.Adapter;
import cts.ase.adapter.clase.spital.Medicament;

public static void procuraMedicament(cts.ase.adapter.clase.farmacie.Medicament medFarmacie){
    medFarmacie.cumpărăMedicament();
}

    public static void main(String[] args) {
        Medicament medicament1 = new Medicament("Nurofen", 40);
        cts.ase.adapter.clase.farmacie.Medicament medicament2 = new cts.ase.adapter.clase.farmacie.Medicament("Paracetamol");

        medicament1.achizitioneazaMedicament();
        medicament2.cumpărăMedicament();
        //procuraMedicament(medicament1);

        System.out.println("================================================");
        procuraMedicament(medicament2);

        Adapter adapter = new Adapter(medicament1);
        procuraMedicament(adapter);
    }


