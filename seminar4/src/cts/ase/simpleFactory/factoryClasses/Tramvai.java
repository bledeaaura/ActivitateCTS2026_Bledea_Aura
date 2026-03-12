package cts.ase.simpleFactory.factoryClasses;

public class Tramvai extends MijlocTransport{
    public Tramvai(int nrRoti, String numarInmatriculare) {
        super(nrRoti, numarInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tramvaiul are numar roti: ").append(super.nrRoti).append("Nr Inmatriculare: ").append(super.numarInmatriculare);
        System.out.println(builder);
    }
}
