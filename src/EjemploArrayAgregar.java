import java.util.Scanner;

public class EjemploArrayAgregar {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            a[i] = s.nextInt();
        }

        System.out.print("Ingrese la poscion: ");
        int pos = s.nextInt();

        System.out.print("Ingrese el elemento: ");
        int nuevoElemento = s.nextInt();

        int total = a.length - 1;
        int ultPosicion = a[total];

        for (int i = total - 1; i >= pos; i--) {
            a[i+1] = a[i];
        }

        int[] b = new int[a.length + 1];
        System.arraycopy(a,0,b,0,a.length);

        a = b;
        a[pos] = nuevoElemento;
        a[a.length-1] = ultPosicion;

        imprimirArreglo(a);

    }

    private static void imprimirArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + (i+1) + ": " + arreglo[i]);
        }
    }
}
