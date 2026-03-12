package main;

import cts.ase.singleton.Hotel;

public class Main {
    public static void main(String[] args) {
        Hotel hotel1 = Hotel.getInstance("H1", 7, 5);
        Hotel hotel2 = Hotel.getInstance("H2", 200, 0);

        hotel1.rezervareCamera();
        hotel1.rezervareCamera();

        hotel2.rezervareCamera();
        hotel2.rezervareCamera();
    }
}
