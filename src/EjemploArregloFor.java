import java.util.Arrays;

public class EjemploArregloFor {
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

        System.out.println("----------- Usando foreach -----------");

        for (String producto: productos)
        {
            System.out.println("producto = " + producto);
        }

        System.out.println("----------- Usando while -----------");

        int i = 0;
        while (i < cantidad){
            System.out.println("Para indice " +  i + " = " + productos[i]);
            i++;
        }

        System.out.println("----------- Usando do while -----------");

        int j = 0;
        do {
            System.out.println("Para indice " +  j + " = " + productos[j]);
            j++;
        } while(j < cantidad);

        int cantidadNumero = numeros.length;

        for (int k = 0; k < cantidadNumero; k++){
            numeros[k] = k * 3;
        }

        for (int k = 0; k < cantidadNumero; k++){
            System.out.println("numeros[k] = " + numeros[k]);
        }

    }
}
