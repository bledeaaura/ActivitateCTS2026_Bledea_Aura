package cts.ase.adapter.clase.farmacie;

public class Medicament {
    private String numeMedicament;

    public Medicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }


    public void cumpărăMedicament(){
        System.out.println("Medicamentul cu numele " + numeMedicament + "a fost achizitionat");
    }

}
