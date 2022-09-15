import java.util.Scanner;

public class EjemploNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMat= 0, sumNotasHis= 0, sumNotasLen = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);

        System.out.println("\nIngrese 7 notas para matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++){
            System.out.print("Nota " + (i+1) + ": ");
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("\nIngrese 7 notas para historia: ");
        for (int i = 0; i < claseHistoria.length; i++){
            System.out.print("Nota " + (i+1) + ": ");
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("\nIngrese 7 notas para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++){
            System.out.print("Nota " + (i+1) + ": ");
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++){
            sumNotasMat += claseMatematicas[i];
            sumNotasHis += claseHistoria[i];
            sumNotasLen += claseHistoria[i];
        }

        double promedioHis = sumNotasHis/claseHistoria.length;
        double promedioLen = sumNotasLen/claseLenguaje.length;
        double promedioMat = sumNotasMat/claseMatematicas.length;

        System.out.println("Promedio clase matematicas: " + promedioMat);
        System.out.println("Promedio clase historia: " + promedioHis);
        System.out.println("Promedio clase lenguaje: " + promedioLen);
        System.out.println("Promedio del curso: " +
                (promedioHis + promedioLen + promedioMat)/3);

        System.out.print("Ingrese identificador del alumno (de 0 a 6): ");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseHistoria[id])/3;
        System.out.println("Promedio alumno Nro" + id + ": " + promedioAlumno);
    }
}
