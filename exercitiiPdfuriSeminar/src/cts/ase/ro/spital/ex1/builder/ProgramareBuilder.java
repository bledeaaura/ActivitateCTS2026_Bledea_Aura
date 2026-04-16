package cts.ase.ro.spital.ex1.builder;

public class ProgramareBuilder {

    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuciCamera;
    private boolean halat;

    public ProgramareBuilder setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
        return this;
    }

    public ProgramareBuilder setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
        return this;
    }

    public ProgramareBuilder setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
        return this;
    }

    public ProgramareBuilder setHalat(boolean halat) {
        this.halat = halat;
        return this;
    }

   public Programare build(){
        return new Programare(patRabatabil, micDejun, papuciCamera, halat);
   }
}
