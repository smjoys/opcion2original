package vista;

import cuerpo.PolinomioList;
import cuerpo.ProductoPolinomio;
import cuerpo.SumaPolinomio;

import java.util.Scanner;

public class TheMain {
    public static void main(String[] args) {
        Scanner tcld = new Scanner(System.in);

        int opcion;

        System.out.println("");
        System.out.println("1: suma de polinomios");
        System.out.println("2: multipliacion de polinomios de polinomios");
        System.out.println("3: si desea salir del programa");
        System.out.println("");
        System.out.print("eliga la opcion que desea realizar: ");
        opcion = tcld.nextInt();

        if(opcion>0 && opcion<4) {
            do {
                System.out.println("");
                System.out.println("1: suma de polinomios");
                System.out.println("2: multipliacion de polinomios");
                System.out.println("3: si desea salir del programa");
                System.out.println("");
                System.out.print("eliga la opcion que desea realizar: ");
                opcion = tcld.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        PolinomioList Polinomio1 = new PolinomioList();
                        PolinomioList Polinomio2 = new PolinomioList();
                        System.out.println("De cuantos terminos sera el primer polinomio");
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        int Nterminos;
                        System.out.print("Ingrese: ");
                        Nterminos=tcld.nextInt();
                        for(int i= 1; i<=Nterminos; i++){
                            System.out.println("Para el termino " + i);
                            System.out.print("Ingrese el coeficiente: ");
                            int coef= tcld.nextInt();
                            System.out.print("Ingrese el exponente: ");
                            int exp= tcld.nextInt();
                            if(exp==0){
                                exp=-1;
                            }
                            Polinomio1.insertarTermino(coef,exp);
                        }

                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("De cuantos terminos sera el segundo polinomio");
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        int Nterminos2;
                        System.out.print("Ingrese: ");
                        Nterminos2=tcld.nextInt();
                        for(int i= 1; i<=Nterminos2; i++){
                            System.out.println("Para el termino " + i);
                            System.out.print("Ingrese el coeficiente: ");
                            int coef= tcld.nextInt();
                            System.out.print("Ingrese el exponente: ");
                            int exp= tcld.nextInt();
                            if(exp==0){
                                exp=-1;
                            }
                            Polinomio2.insertarTermino(coef,exp);
                        }
                        System.out.println();
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.print("EL RESULTADO DE LA SUMA DE LOS POLINOMIOS ES: ");
                        SumaPolinomio suma = new SumaPolinomio();
                        System.out.println(suma);
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println();
                        break;
                    case 2:
                        Polinomio1 = new PolinomioList();
                        Polinomio2 = new PolinomioList();
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("De cuantos terminos sera el primer polinomio");
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.print("Ingrese: ");
                        Nterminos=tcld.nextInt();
                        for(int i= 1; i<=Nterminos; i++){
                            System.out.println("Para el termino " + i);
                            System.out.print("Ingrese el coeficiente: ");
                            int coef= tcld.nextInt();
                            System.out.print("Ingrese el exponente: ");
                            int exp= tcld.nextInt();
                            if(exp==0){
                                exp=-1;
                            }
                            Polinomio1.insertarTermino(coef,exp);
                        }
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println("De cuantos terminos sera el segundo polinomio");
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.print("Ingrese: ");
                        Nterminos2=tcld.nextInt();
                        for(int i= 1; i<=Nterminos2; i++){
                            System.out.println("Para el termino " + i);
                            System.out.print("Ingrese el coeficiente: ");
                            int coef= tcld.nextInt();
                            System.out.print("Ingrese el exponente: ");
                            int exp= tcld.nextInt();
                            if(exp==0){
                                exp=-1;
                            }
                            Polinomio2.insertarTermino(coef,exp);
                        }
                        System.out.println();
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.print("EL RESULTADO DEL PRODUCTO DE LOS POLINOMIOS ES: ");
                        ProductoPolinomio producto = new ProductoPolinomio();
                        System.out.println(producto);
                        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Programa finalizado con exito");
                        break;
                }
            } while (opcion!=3);
        }else {
            System.out.println("la opcion ingresada es incorrecta");
        }
    }
}
