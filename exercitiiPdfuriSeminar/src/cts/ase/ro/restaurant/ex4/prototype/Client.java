package cts.ase.ro.restaurant.ex4.prototype;

public class Client implements IClient{

    private String nume;
    private String numarTelefon;
    private String cnp;
    private int ziRezervare;

    public Client() {
    }

    public Client(String nume, String numarTelefon, String cnp, int ziRezervare) {
        this.nume = nume;
        if (numarTelefon.length() != 10){
            throw new IllegalArgumentException("numar telefon introdus gresit");
        }
        this.numarTelefon = numarTelefon;
        if (cnp.length() != 13){
            throw new IllegalArgumentException("CNP introdus gresit");
        }
        this.cnp = cnp;
        if (ziRezervare>31){
            throw new IllegalArgumentException("Verificati ziua introdusa la rezervare");
        }
        this.ziRezervare = ziRezervare;
    }


    @Override
    public IClient clone() {
        Client client = new Client();
        client.nume = this.nume;
        client.numarTelefon = this.numarTelefon;
        client.cnp = this.cnp;
        client.ziRezervare = this.ziRezervare;
        return client;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numarTelefon='").append(numarTelefon).append('\'');
        sb.append(", cnp='").append(cnp).append('\'');
        sb.append(", ziRezervare=").append(ziRezervare);
        sb.append('}');
        return sb.toString();
    }
}
