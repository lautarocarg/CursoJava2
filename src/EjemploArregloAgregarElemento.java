import java.util.Scanner;

public class EjemploArregloAgregarElemento {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }

        System.out.print("Ingrese la poscion: ");
        int pos = s.nextInt();

        System.out.print("Ingrese el elemento: ");
        int nuevoElemento = s.nextInt();

        int total = a.length;

        /*for (int i = total - 1; i > 0; i--) {
            if(i != pos){
                a[i] = a[i - 1];
            }
            else{
                a[i] = nuevoElemento;
                break;
            }
        }*/

        for (int i = total - 2; i >= pos; i--) {
            a[i+1] = a[i];
        }
        a[pos] = nuevoElemento;

        imprimirArreglo(a);
    }

    private static void imprimirArreglo(int[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.println("Indice " + (i + 1) + ": " + arreglo[i]);
        }
    }
}
