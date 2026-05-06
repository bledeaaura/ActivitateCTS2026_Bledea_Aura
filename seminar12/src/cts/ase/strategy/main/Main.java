package cts.ase.strategy.main;

import cts.ase.strategy.ProbaScrisa;
import cts.ase.strategy.Student;

public class Main {
    public static void main(String[] args) {
        Student student  = new Student("Vasi");
        student.examinare();

        student.setModSustinere(new ProbaScrisa());
        student.examinare();
    }
}
