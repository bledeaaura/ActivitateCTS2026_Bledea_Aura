package cts.ase.ro.spital.ex1.builder.main;

import cts.ase.ro.spital.ex1.builder.Programare;
import cts.ase.ro.spital.ex1.builder.ProgramareBuilder;

public class Main {
    public static void main(String[] args) {
        Programare programare1 = new ProgramareBuilder().setPatRabatabil(true).setHalat(true).build();
        programare1.afiseazaDetaliiProgramare();
    }
}
