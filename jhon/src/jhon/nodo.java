package jhon;

public class nodo {

    byte dato;
    nodo siguiente;

  
    public nodo() {
        dato = 0;
        siguiente = null;
    }

    public nodo(byte d) {
        dato = d;
       siguiente = null;
    }

    public nodo(byte d, nodo s) {

        dato = d;
        siguiente = s;
    }
}
