package cts.ase.abstractFactory.factoryClasses;

public class SupaDeCiuperci extends Supa{
    public SupaDeCiuperci(double pret, float gramaj) {
        super(pret, gramaj);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de ciuperci are ").append(super.toString());
        System.out.println(sb);
    }
}
