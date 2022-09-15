import java.util.Scanner;

public class EjemploArregloBuscarNumero {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 numeros: ");
        for (int i = 0; i < a.length; i++){
            System.out.print("Numero " + (i+1) + ": ");
            a[i] = s.nextInt();
        }

        System.out.print("\r\n Ingrese un número a buscar: " );
        int num = s.nextInt();

        int i = 0;

        for(; i < a.length && a[i] != num; i++){}

        /*
        while (i < a.length && a[i] != num){
            i++;
        }*/

        if(i == a.length){
            System.out.println("No se encontró");
        }
        else if(a[i] == num){
            System.out.println("Numero encontrado en la poscicion " + i);
        }
    }
}
