import java.util.Arrays;

public class EjemploArregloForInverso {
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

        for(int i = 0; i<cantidad; i++){
            System.out.println("Para i = " + (cantidad-1-i) + " valor: " + productos[cantidad-1-i]);
        }

        for(int i = cantidad-1; i >= 0; i--){
            System.out.println("Producto i = " + productos[i]);
        }

    }
}
