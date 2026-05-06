package cts.ase.command;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Comanda> listaComenzi = new ArrayList<>();

    public void adaugaComanda(Comanda comanda){
        listaComenzi.add(comanda);
    }

    public void executaComanda(){
        if (listaComenzi.size() > 0){
            listaComenzi.get(0).pleacaInCursa();
            listaComenzi.remove(0);
        }
    }
}
