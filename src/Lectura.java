import java.util.Scanner;

public class Lectura {

    public static void main(String[] args) {

        //La clase scanner permite recibir datos

        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe el nombre de la pelicula");

        String pelicula = teclado.nextLine();

        System.out.println("Escribe la fecha de lanzamiento");

        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Dinos que nota le das a esta película (usar , para separar)");

        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechaDeLanzamiento);
        System.out.println(nota);
    }
}
