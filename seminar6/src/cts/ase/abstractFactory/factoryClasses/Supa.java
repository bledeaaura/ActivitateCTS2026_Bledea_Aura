package cts.ase.abstractFactory.factoryClasses;

public abstract class Supa implements FelDeMancare{
    protected double pret;
    protected float gramaj;

    public Supa(double pret, float gramaj) {
        this.pret = pret;
        this.gramaj = gramaj;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supe{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
