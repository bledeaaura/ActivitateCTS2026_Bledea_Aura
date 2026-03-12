package cts.ase.simpleFactory.factoryClasses;

public abstract class MijlocTransport {

    protected int nrRoti;
    protected String numarInmatriculare;

    public MijlocTransport(int nrRoti, String numarInmatriculare) {
        this.nrRoti = nrRoti;
        this.numarInmatriculare = numarInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
