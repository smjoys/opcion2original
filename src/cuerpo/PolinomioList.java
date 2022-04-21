package cuerpo;

import cuerpo.Nodo;

public class PolinomioList {
    private Nodo inicio;
    private Nodo fin;

    public PolinomioList() {
        inicio = null;
        fin = null;
    }
    //insertar
    public void insertarTermino(int co, int ex) {
        if (estaVacia()) fin = inicio = new Nodo(co, ex,null);
        else inicio = new Nodo(co, ex, inicio);

    }
    //esta vacio??
    public boolean estaVacia() {return inicio==null;}

    public void insertadFinal(int co, int ex) {
        if (estaVacia()) inicio = new Nodo(co,ex,null);
        else fin =fin.next = new Nodo(co,ex);
    }

}
