package Ejercicio3;

public class Pila {

    Nodo cima;
    int tam;

    public Pila () {
        this.cima = null;
        this.tam = 0;
    }

    public boolean EstaVacia () {
        return cima == null;
    }

    public void Agregar (int d) {
        Nodo nuevo = new Nodo (d);
        nuevo.siguiente = cima;
        cima = nuevo;
        tam ++;
    }

    public int quitar () {
        int aux = cima.dato;
        cima = cima.siguiente;
        tam--;
        return aux;
    }

    public int cima () {
        return cima.dato;
    }

    public int tam () {
        return tam;
    }

    public void MostrarPila () {
        Nodo aux = cima;
        while (aux!= null) {
            System.out.println ("[" + aux.dato + "]");
            aux = aux.siguiente;
        }
        System.out.println ("");
    }


    }

