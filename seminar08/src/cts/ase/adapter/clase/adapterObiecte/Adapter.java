package cts.ase.adapter.clase.adapterObiecte;

import cts.ase.adapter.clase.spital.Medicament;

public class Adapter extends cts.ase.adapter.clase.farmacie.Medicament {
    private Medicament medicament;

    public Adapter(Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumpărăMedicament() {
        medicament.achizitioneazaMedicament();
    }
}
