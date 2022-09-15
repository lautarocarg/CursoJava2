import java.util.Scanner;

public class EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalPares = 0;
        int totalImpares = 0;

        a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 enteros: ");
        for (int i = 0; i < a.length; i++){
            System.out.print("Entero " + (i+1) + ": ");
            a[i] = s.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                totalPares++;
            }
            else{
                totalImpares++;
            }
        }

        pares = new int[totalPares];
        impares = new int[totalImpares];

        int auxPar = 0, auxImp = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0){
                pares[auxPar++] = a[i];
            }
            else{
                impares[auxImp++] = a[i];
            }
        }

        System.out.println("\n Pares");
        imprimirArreglo(pares);

        System.out.println("\n Impares");
        imprimirArreglo(impares);


    }

    private static void imprimirArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + ": " + arreglo[i]);
        }
    }


}
