import java.util.ArrayList;
import java.util.Arrays;

public class EjemploArreglo {
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

        String prod0 = productos[0];
        String prod1 = productos[1];
        String prod2 = productos[2];
        String prod3 = productos[3];
        String prod4 = productos[4];
        String prod5 = productos[5];
        String prod6 = productos[6];


        System.out.println("prod0 = " + prod0);
        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);


        numeros[0] = 1;
        numeros[1] = 212;
        numeros[2] = 34;
        numeros[3] = -35;

        Arrays.sort(numeros);

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];



        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);


    }
}
