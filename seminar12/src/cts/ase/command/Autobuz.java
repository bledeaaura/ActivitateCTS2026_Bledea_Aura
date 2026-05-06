package cts.ase.command;

public class Autobuz {
    private String producator;
    private int nrLinie;

    public Autobuz(String producator) {
        this.producator = producator;
    }

    public void plecarePeTraseu(int nrLinie){
        System.out.println("Autobuzul " + this.producator + " porneste pe linia " + nrLinie);
    }
}
