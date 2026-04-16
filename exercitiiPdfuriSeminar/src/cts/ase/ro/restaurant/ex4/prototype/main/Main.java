package cts.ase.ro.restaurant.ex4.prototype.main;

import cts.ase.ro.restaurant.ex4.prototype.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Alin", "0733554469", "0506083243542", 31);
        Client client2 = (Client) client1.clone();
        System.out.println(client1);
        System.out.println(client2);
    }
}
