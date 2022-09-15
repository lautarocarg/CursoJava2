import java.util.Locale;
import java.util.Scanner;

public class EjemploArregloBuscarString {
    public static void main(String[] args) {
        String[] a = new String[4];
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 10 textos: ");
        for (int i = 0; i < a.length; i++){
            System.out.print("Texto " + (i+1) + ": ");
            a[i] = s.next();
        }

        System.out.print("\r\n Ingrese un texto a buscar: " );
        String text = s.next();

        int i = 0;

        for(; i < a.length && !a[i].equalsIgnoreCase(text); i++){}
        
        /*
        while (i < a.length && a[i] != num){
            i++;
        }*/

        if(i == a.length){
            System.out.println("No se encontró");
        }
        else if(a[i].toLowerCase().compareTo(text.toLowerCase()) == 0){
            System.out.println("Texto encontrado en la poscicion " + i);
        }
    }
}
