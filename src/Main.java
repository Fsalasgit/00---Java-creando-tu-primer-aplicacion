public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        //Tipos de datos primitivos
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        //Textos

        String sipnosis; //variable inicializada sin valor atribuido
        sipnosis = """
                Matrix es una paradoja,
                la mejor pelicula del fin del mileni
                Fué lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println(sipnosis);

        //convertir los tipos de datos  a estrellas (Casteo)

        int clasificacion = (int) (media / 2);



    }
}