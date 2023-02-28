package jhon;

import java.util.Scanner;

public class lista {
String dato;
    nodo inicio;

    public lista() {
        inicio = null;
    }

    public lista(nodo i) {
        inicio = i;
    }

    public void insertarFin(byte k) {

        nodo nuevo = new nodo(k);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nodo aux = inicio;

            while (aux.siguiente != null) {
                aux = aux.siguiente;  }
            aux.siguiente = nuevo;
            
        }
    }

    public void eliminar(byte k) {
        if (inicio == null) {
            // no hay nada para eliminar
            return;
        }

        if (inicio.dato == k) {
            // eliminar primer nodo
            inicio = inicio.siguiente;
            return;
        }

        nodo anterior = inicio;
        nodo actual = inicio.siguiente;

        while (actual != null && actual.dato != k) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            // la variable no esta en la lista
            return;
        }

        //actualiza la ubicacion de la variable para saltar el nodo
        anterior.siguiente = actual.siguiente;
    }

    public void insertarInicio(byte k) {
        nodo nuevo = new nodo(k);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    public void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.siguiente;
            System.out.println("dato eliminado al inicio de la lista");
        }
        
    }

    public void eliminarFin() {
        if (inicio != null) {
            if (inicio.siguiente == null) {
                // la lista tiene un elemento y lo elimina
                inicio = null;
            }  else {
                // Recorre la lista hasta antes del ultimo nodo.
                nodo aux = inicio;
                while (aux.siguiente.siguiente != null) {
                    aux = aux.siguiente;
                }
                // Actualiza la ubicacion siguiente del penúltimo nodo para que sea null.
                aux.siguiente = null;
                System.out.println("dato eliminado al final de la lista");
            }
        }
    }
    Scanner sc = new Scanner(System.in);

    public void eliminarDato(byte k) {
        if (inicio != null) {
            if (inicio.dato == k) {
                // la variable a eliminar está al inicio de la lista.
                inicio = inicio.siguiente;
            } else {
                // Recorre la lista buscando el nodo a eliminar.
                nodo aux = inicio;
                while (aux.siguiente != null && aux.siguiente.dato != k) {
                    aux = aux.siguiente;
                }
                // Si encontramos la variable a eliminar, lo eliminamos actualizando las ubicaciones.
                if (aux.siguiente != null) {
                    aux.siguiente = aux.siguiente.siguiente;
                    System.out.println("El nodo " + k + " ha sido eliminado exitosamente");
                }
            }
        }
    }

    public nodo buscarDato(byte datoBuscado) {
    nodo actual = inicio;
    int posicion = 0;

    while (actual != null && actual.dato != datoBuscado) {
        actual = actual.siguiente;
        posicion++;
    }

    if (actual != null) {
        System.out.println("El dato " + datoBuscado + " se encuentra en el nodo " + posicion + " de la lista.");
    } else {
        System.out.println("El dato " + datoBuscado + " no se encuentra en la lista.");
    }

    return actual;
}

    
    public void imprimirListaGrafica() {
    if (inicio == null) {
        System.out.println("La lista está vacía.");
        return;
    }

    nodo actual = inicio;
    while (actual != null) {
        System.out.print("     ");
        actual = actual.siguiente;
    }
    System.out.println();

    actual = inicio;
    while (actual != null) {
        System.out.print("       " + actual.dato + "       ");
        actual = actual.siguiente;
    }
    System.out.println();

    actual = inicio;
    while (actual != null) {
        if (actual.siguiente != null) {
            System.out.print("        ");
        } else {
            System.out.print("        ");
        }
        actual = actual.siguiente;
    }
    System.out.println();

    actual = inicio;
    while (actual != null) {
        System.out.println("   ");
        actual = actual.siguiente;
    }
    System.out.println();
}

}
