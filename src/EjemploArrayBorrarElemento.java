import java.util.Scanner;

public class EjemploArrayBorrarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }

        System.out.print("Ingrese una posicion para eliminar: ");
        int nuevoElemento = s.nextInt();

        int total = a.length;
        for (int i = nuevoElemento; i < total-1; i++) {
            a[i] = a[i+1];
        }

        imprimirArreglo(a);

        int[] b = new int[a.length - 1];
        System.arraycopy(a,0,b,0,b.length);

        System.out.println("\r\n**** Nuevo arreglo ****");

        imprimirArreglo(b);
    }

    private static void imprimirArreglo(int[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.println("Indice " + (i + 1) + ": " + arreglo[i]);
        }
    }
}
