package cts.ase.ro.restaurant.ex2.builder;

public class RezervareBuilder {
    private boolean asezareGeam = false;
    private boolean scauneErgonomice = false;
    private boolean decorMasa = false;
    private boolean muzicaAmbientala = false;
    private boolean genMuzica = false;

    public RezervareBuilder setAsezareGeam(boolean asezareGeam) {
        this.asezareGeam = asezareGeam;
        return this;
    }

    public RezervareBuilder setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
        return this;
    }

    public RezervareBuilder setDecorMasa(boolean decorMasa) {
        this.decorMasa = decorMasa;
        return this;
    }

    public RezervareBuilder setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
        return this;
    }

    public RezervareBuilder setGenMuzica(boolean genMuzica) {
        this.genMuzica = genMuzica;
        return this;
    }

    public Rezervare build() {
        return new Rezervare(asezareGeam, scauneErgonomice,decorMasa,muzicaAmbientala, genMuzica);
    }
}
