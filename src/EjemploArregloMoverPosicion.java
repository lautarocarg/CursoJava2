import java.util.Scanner;

public class EjemploArregloMoverPosicion {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            a[i] = s.nextInt();
        }

        int total = a.length;
        int auxPim = a[total-1];
        for(int i = total-1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[0] = auxPim;

        imprimirArreglo(a);
    }

    private static void imprimirArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + (i+1) + ": " + arreglo[i]);
        }
    }

    private static void rellenarArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            arreglo[i] = i+1;
        }
    }
}
