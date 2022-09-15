import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjemploArregloAgregarOrdenado {
    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 9 numeros: ");
        for (int i = 0; i < a.length-1; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            a[i] = s.nextInt();
        }

        System.out.print("Ingrese el elemento: ");
        int nuevoElemento = s.nextInt();

        int total = a.length;
        for (int i = total - 2; i >= 0; i--) {
            if((nuevoElemento < a[i] && nuevoElemento < a[i+1] && i != 0) || (a[i+1] == 0 && nuevoElemento < a[i])){
                a[i+1] = a[i];
            }
            else if(i != 0){
                a[i+1] = nuevoElemento;
                break;
            }
            else{
                a[i+1] = a[i];
                a[i] = nuevoElemento;
            }
        }

        imprimirArreglo(a);
    }

    private static void imprimirArreglo(int[] arreglo) {
        int total = arreglo.length;
        for (int i = 0; i < total; i++) {
            System.out.println("Indice " + (i + 1) + ": " + arreglo[i]);
        }
    }
}
