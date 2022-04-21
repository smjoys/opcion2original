package vista;

import cuerpo.PolinomioList;

public class TheMain {
    public static void main(String[] args) {
        PolinomioList poli = new PolinomioList();
        poli.insertarTermino(2,3);
        System.out.println(poli);
    }
}
