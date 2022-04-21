package cuerpo;

public class Nodo {
    Nodo next;
    int coef;
    int exp;

    public Nodo(int co,int ex){
        this.coef=co;
        this.exp=ex;
        next = null;
    }
    public Nodo(int co,int ex,Nodo nuevo){
        this.coef=co;
        this.exp=ex;
        next = nuevo;
    }

    int getCoef()
    {
        return this.coef;
    }

    int getExp()
    {
        return this.exp;
    }
    Nodo getNext()
    {
        return next;
    }
}
