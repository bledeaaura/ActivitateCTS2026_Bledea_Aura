package cts.ase.singleton;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int numarCamereOcupate;
    public static Hotel instance=null;

    private Hotel(String numeHotel, int numarCamere, int numarCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.numarCamereOcupate = numarCamereOcupate;
    }

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int numarCamereOcupate){
        if(instance == null){
            instance = new Hotel(numeHotel, numarCamere, numarCamereOcupate);
        }
        return instance;
    }

    public void rezervareCamera(){
        if(this.numarCamere < this.numarCamereOcupate){
            System.out.println("Rezervarea a fost realizata.");
            numarCamereOcupate++;
        }
        else{
            System.out.println("Nu exista camere.");
        }
    }

    public void afiseazaDetaliiHotel(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.numeHotel).append(this.numarCamere).append(this.numarCamereOcupate);
        System.out.println(builder);
    }
}
