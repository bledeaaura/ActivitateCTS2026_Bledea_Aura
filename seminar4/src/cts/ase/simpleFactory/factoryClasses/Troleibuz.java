package cts.ase.simpleFactory.factoryClasses;

public class Troleibuz extends MijlocTransport{
    public Troleibuz(int nrRoti, String numarInmatriculare) {
        super(nrRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Troleibuzul are numar roti: ").append(super.nrRoti).append("Nr Inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder);
    }
}
