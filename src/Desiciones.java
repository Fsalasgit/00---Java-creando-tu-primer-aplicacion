public class Desiciones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "basic";

        //texto comentado
        if (fechaDeLanzamiento > 2022){

            System.out.println("Pelicula moderna");
        }else {
            System.out.println("Pelicula vieja");
        }

        /*
        || = 0 && = Y
         */
        if (incluidoEnPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else{
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
