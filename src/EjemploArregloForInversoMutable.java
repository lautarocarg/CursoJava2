import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploArregloForInversoMutable {
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
    public static void main(String[] args) {

        int[] numeros = new int[4];

        String productos[] = new String[7];

        productos[0] = "Kingston";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro";
        productos[3] = "Asus notebook";
        productos[4] = "Macbook";
        productos[5] = "Chromecast";
        productos[6] = "Bicicleta";

        Arrays.sort(productos);
        int cantidad = productos.length;

        System.out.println("----------- Usando for -----------");

        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Para indice " +  i + " = " + productos[i]);
        }

        arregloInverso(productos);
        Collections.reverse(Arrays.asList(productos));


        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Para indice " +  i + " = " + productos[i]);
        }

    }
}
