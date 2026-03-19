package cts.ase.abstractFactory.factoryClasses;

public class Papanas extends Desert{
    public Papanas(double pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Papanasii au ").append(super.toString());
        System.out.println(sb);
    }
}
