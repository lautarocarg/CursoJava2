public class EjemplosOrreglosOrdenPrincipioFinal {
    public static void main(String[] args) {

        Integer[] numeros = new Integer[10];
        Integer[] a = new Integer[10];

        int total = numeros.length;
        int totalA = numeros.length;

        for(int i = 0; i < total; i++){
            numeros[i] = i + 1;
        }

        imprimirArreglo(numeros);

        System.out.println("\n Ordenamiento \n");

        for(int i = 0; i < total - i; i++){
            System.out.print(numeros[i] + " - ");
            System.out.println(numeros[total - 1 - i]);
        }

        int aux = 0;
        for(int i = 0; i < total - i; i++){
            a[aux++] = numeros[i];
            a[aux++] = numeros[total - 1 - i];
        }

        imprimirArreglo(a);
    }

    public static void imprimirArreglo(Object[] arreglo){
        int cantidad = arreglo.length;
        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Para indice " +  i + " = " + arreglo[i]);
        }

    }

    private static void rellenarArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            arreglo[i] = i+1;
        }
    }
}
