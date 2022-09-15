import java.util.Arrays;
import java.util.Collections;

public class EjemploArregloArregloBurbbuja {
    public static void arregloInverso(String[] arreglo){
        int cantidad2 = arreglo.length ;
        int cantidad = arreglo.length ;

        for (int i = 0; i < cantidad2; i++){
            String actual = arreglo[i];
            String inverso = arreglo[cantidad-1-i];
            arreglo[i] = inverso;
            arreglo[cantidad-1-i] = actual;
            cantidad2--;
        }
    }

    public static void algoritmoBubuja(Object[] arreglo, boolean ascendente){
        int cantidad = arreglo.length;

        for(int i = 0; i < cantidad - 1; i++){
            for(int j = 0; j < cantidad - 1 - i; j++){
                if(ascendente){
                    if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) < 0){
                        Object aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                    }
                }
                else{
                    if(((Comparable)arreglo[j+1]).compareTo(arreglo[j]) > 0){
                        Object aux = arreglo[j];
                        arreglo[j] = arreglo[j+1];
                        arreglo[j+1] = aux;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Integer[] numeros = new Integer[4];

        numeros[0] = 1;
        numeros[1] = 212;
        numeros[2] = 34;
        numeros[3] = -35;

        String productos[] = new String[7];

        productos[0] = "Kingston";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";

        //Arrays.sort(productos);
        System.out.println("\n********* Orden ascendente *********");
        System.out.println("\nNumeros:");
        algoritmoBubuja(numeros, true);
        imprimirArreglo(numeros);
        System.out.println("\nProductos: ");
        algoritmoBubuja(productos, true);
        imprimirArreglo(productos);
        System.out.println("\n********* Orden descendente *********");
        System.out.println("\nNumeros:");
        algoritmoBubuja(numeros, false);
        imprimirArreglo(numeros);
        System.out.println("\nProductos: ");
        algoritmoBubuja(productos, false);
        imprimirArreglo(productos);


    }

    public static void imprimirArreglo(Object[] arreglo){
        int cantidad = arreglo.length;
        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Para indice " +  i + " = " + arreglo[i]);
        }

    }
}
