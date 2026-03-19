package cts.ase.prototype.classes;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private int ziuaRezervare;
    private String numarTelefon;

    private Rezervare() {
    }

    public Rezervare(String numeClient, int oraRezervare, int ziuaRezervare, String numarTelefon) {
        if (numeClient.length() > 1){
            this.numeClient = numeClient;
        } else {
            this.numeClient = "Ion";
        }
        if (oraRezervare <23 && oraRezervare>9){
            this.oraRezervare = oraRezervare;
        }
        else {
            this.oraRezervare = 9;
        }
        if(ziuaRezervare < 30){
            this.ziuaRezervare = ziuaRezervare;
        } else{
            this.ziuaRezervare = 23;
        }
        if(numarTelefon.length() == 10){
            this.numarTelefon = numarTelefon;
        }else {
            this.numarTelefon = "0777777887";
        }
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setOraRezervare(int oraRezervare) {
        this.oraRezervare = oraRezervare;
    }

    public void setZiuaRezervare(int ziuaRezervare) {
        this.ziuaRezervare = ziuaRezervare;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziuaRezervare=").append(ziuaRezervare);
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public RezervareAbstracta clone() {
        Rezervare rezervareNoua = new Rezervare();
        rezervareNoua.numeClient = this.numeClient;
        rezervareNoua.oraRezervare = this.oraRezervare;
        rezervareNoua.ziuaRezervare = this.ziuaRezervare;
        rezervareNoua.numarTelefon = this.numarTelefon;
        return rezervareNoua;
    }

}
