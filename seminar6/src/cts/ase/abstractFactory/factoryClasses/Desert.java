package cts.ase.abstractFactory.factoryClasses;

public abstract class Desert implements FelDeMancare{
    protected double pret;
    protected float gramaj;
    protected int calorii;

    public Desert(double pret, float gramaj, int calorii) {
        this.pret = pret;
        this.gramaj = gramaj;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("pret=").append(pret);
        sb.append(", gramaj=").append(gramaj);
        sb.append(", calorii=").append(gramaj);
        sb.append('}');
        return sb.toString();
    }
}
