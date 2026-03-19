package cts.ase.abstractFactory.factoryClasses;

public class SupaDeLegume extends Supa{
    public SupaDeLegume(double pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de legume are ").append(super.toString());
        System.out.println(sb);
    }
}
