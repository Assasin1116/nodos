package jhon;


import jhon.lista;
import jhon.nodo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        lista miLista = new lista();
        Scanner sc = new Scanner(System.in);
        byte opcion;
        byte dato;

        do {
            System.out.println(" MENU PRINCIPAL \n"
                    + "1.Insertar nodo al inicio\n"
                    + "2.Insertar nodo al final\n"
                    + "3.Eliminar nodo al inicio\n"
                    + "4.Eliminar nodo al final\n"
                    + "5.Eliminar dato especifico\n"
                    + "6.Buscar dato en la lista\n"
                    + "7.Imprimir lista\n\n"
                    + "Ingrese la opcion:"
                    );
            opcion = sc.nextByte();
            
                    System.out.println("---------------------------");

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    dato = sc.nextByte();
                    miLista.insertarInicio(dato);
                    System.out.println("Dato insertado al inicio de la lista.\n\n");
                    break;
                case 2:
                    System.out.print("Ingrese el dato a insertar: ");
                    dato = sc.nextByte();
                    miLista.insertarFin(dato);
                    System.out.println("Dato insertado al final de la lista.\n\n");
                    break;
                case 3:
                    miLista.eliminarInicio();
                    break;
                case 4:
                    miLista.eliminarFin();
                    break;
                case 5:
                    System.out.print("Ingrese el dato a eliminar: ");
                    dato = sc.nextByte();
                    miLista.eliminarDato(dato);
                    break;
                case 6:
                    System.out.print("Ingrese el dato a buscar: ");
                    dato = sc.nextByte();
                    nodo resultado = miLista.buscarDato(dato);
                    if (resultado == null) {
                        System.out.println("El dato no se encontró en la lista.\n\n");
                    } else {
                        System.out.println("El dato se encontró en la lista.\n\n");
                    }
                    break;
                case 7:
                    System.out.println("Imprimiendo lista");
                    miLista.imprimirListaGrafica();
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }
}
