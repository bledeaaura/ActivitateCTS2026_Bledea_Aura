package cts.ase.ro.spital.ex4.prototype;

public class Reteta implements IReteta{

    private String solutie;
    private int cantitate;

    public Reteta() {

    }

    public Reteta(String solutie, int cantitate) {
        super();
        if(solutie.length()<2){
            throw new IllegalArgumentException("Solutie invalida");
        }
        this.solutie = solutie;
        if (cantitate>100){
            throw new IllegalArgumentException("Cantitatea depaseste limita admisa");
        }
        this.cantitate = cantitate;
    }

    @Override
    public IReteta clone() {
        Reteta reteta =new Reteta();
        reteta.solutie=this.solutie;
        reteta.cantitate=this.cantitate;
        return reteta;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("solutie='").append(solutie).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
