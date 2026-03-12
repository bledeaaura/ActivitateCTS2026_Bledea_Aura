package cts.ase.simpleFactory.factoryClasses;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrRoti, String numarInmatriculare) {
        super(nrRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Autobuzul are numar roti: ").append(super.nrRoti).append("Nr Inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder);
    }
}
