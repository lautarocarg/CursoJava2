public class EjemploArreglosCominados {
    public static void main(String[] args) {
        int [] a, b ,c;

        a = new int[9];
        b = new int[9];
        c = new int[18];

        int totala = a.length;
        for(int i = 0; i < totala; i++){
            a[i] = i+1;
        }

        int totalb = b.length;
        for(int i = 0; i < totalb; i++){
            b[i] = (i+1)*5;
        }

        int aux = 0;
        for (int i= 0; i < totala; i+=3){
            for(int j = 0; j < 3; j++){
                c[aux++] = a[i + j];
            }
            for(int j = 0; j < 3; j++){
                c[aux++] = b[i + j];
            }

        }

        System.out.println("\nArreglos");
        System.out.println("\n*** A ***");
        imprimirArreglo(a);
        System.out.println("\n*** B ***");
        imprimirArreglo(b);
        System.out.println("\n*** C ***");
        imprimirArreglo(c);

    }

    private static void rellenarArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            arreglo[i] = i+1;
        }
    }

    private static void imprimirArreglo(int[] arreglo){
        int total = arreglo.length;
        for(int i = 0; i < total; i++){
            System.out.println("Indice " + i + ": " + arreglo[i]);
        }
    }
}
