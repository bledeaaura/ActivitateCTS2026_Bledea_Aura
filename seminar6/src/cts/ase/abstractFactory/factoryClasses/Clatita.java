package cts.ase.abstractFactory.factoryClasses;

public class Clatita extends Desert{
    public Clatita(double pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clatita are ").append(super.toString());
        System.out.println(sb);
    }
}
