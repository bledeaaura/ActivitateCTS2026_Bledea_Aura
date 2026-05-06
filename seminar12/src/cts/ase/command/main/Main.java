package cts.ase.command.main;

import cts.ase.command.Autobuz;
import cts.ase.command.Comanda;
import cts.ase.command.Operator;
import cts.ase.command.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();

        Comanda comanda1 = new Plecare(new Autobuz("Mercedes"), 5);
        Comanda comanda2 = new Plecare(new Autobuz("Audi"), 10);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);

        operator.executaComanda();
        operator.executaComanda();
    }
}
