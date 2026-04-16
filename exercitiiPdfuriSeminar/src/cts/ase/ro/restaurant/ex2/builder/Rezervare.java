package cts.ase.ro.restaurant.ex2.builder;

public class Rezervare implements IRezervare{
    private boolean asezareGeam;
    private boolean scauneErgonomice;
    private boolean decorMasa;
    private boolean muzicaAmbientala;
    private boolean genMuzica;

    public Rezervare(boolean asezareGeam, boolean scauneErgonomice, boolean decorMasa, boolean muzicaAmbientala, boolean genMuzica) {
        this.asezareGeam = asezareGeam;
        this.scauneErgonomice = scauneErgonomice;
        this.decorMasa = decorMasa;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rezervare{");
        sb.append("asezareGeam=").append(asezareGeam);
        sb.append(", scauneErgonomice=").append(scauneErgonomice);
        sb.append(", decorMasa=").append(decorMasa);
        sb.append(", muzicaAmbientala=").append(muzicaAmbientala);
        sb.append(", genMuzica=").append(genMuzica);
        sb.append('}');
        return sb.toString();
    }
}
