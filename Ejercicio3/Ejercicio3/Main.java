package Ejercicio3;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    Scanner V = new Scanner(System.in);
    Pila p = new Pila();
    boolean X = true;
    int dato;
    while(X) {
        
        System.out.println("-----MENU-----");
        System.out.println( "[1]insertar numero");
        System.out.println("[2]sacar un numero");
        System.out.println("[3]mostrar cima");
        System.out.println("[4]mostrar si la pila esta vacia");
        System.out.println("[5]mostrar pila");
        System.out.println("[6]Mostrar tamaño de la pila");
        System.out.println("[7]salir");
        int opc = V.nextInt();
        
        switch (opc) {
            case 1:
                System.out.println("Ingrese un numero");
                dato = V.nextInt();
                p.Agregar(dato);
                break;
            case 2:
                if (!p.EstaVacia()) {
                    System.out.println("Numero elimidado: " + p.quitar());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            case 3:
                if (!p.EstaVacia()) {
                    System.out.println("Ultimo numero agregado: " + p.cima());
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            
            case 4:
                if (p.EstaVacia()) {
                    System.out.println("La pila esta vacia");
                } else {
                    System.out.println("La pila tiene " + p.tam());
                }
                break;
            case 5:
                if (!p.EstaVacia()) {
                    p.MostrarPila();
                } else {
                    System.out.println("La pila esta vacia");
                }
                break;
            case 6:
                System.out.println("Tamaño de la pila: " + p.tam());
                break;
            case 7:
                X = false;
                break;
            default:
                System.out.println("Opcion no valida");
        }
      
    } 
}
}
