package cts.ase.ro.spital.ex4.prototype.main;

import cts.ase.ro.spital.ex4.prototype.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta("Sol", 20);
        Reteta reteta2 = (Reteta) reteta1.clone();

        System.out.println(reteta1);
        System.out.println(reteta2);
    }
}
