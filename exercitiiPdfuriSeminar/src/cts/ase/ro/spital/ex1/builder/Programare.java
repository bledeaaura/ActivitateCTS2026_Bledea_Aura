package cts.ase.ro.spital.ex1.builder;

public class Programare implements IProgramare{
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public Programare() {
        this.patRabatabil = false;
        this.micDejun = false;
        this.papuciCamera = false;
        this.halat = false;
    }

    public Programare(boolean patRabatabil, boolean micDejun, boolean papuciCamera, boolean halat) {
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuciCamera = papuciCamera;
        this.halat = halat;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Programare{");
        sb.append("patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuciCamera=").append(papuciCamera);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetaliiProgramare() {
        System.out.println(this);
    }
}
